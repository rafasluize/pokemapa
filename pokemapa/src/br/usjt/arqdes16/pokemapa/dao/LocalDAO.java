package br.usjt.arqdes16.pokemapa.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.usjt.arqdes16.pokemapa.model.Local;

public class LocalDAO {
	public Local criar(Local local) throws IOException{
		String sqlInsert = "insert into local (nmlocal, latitude, longitude, idCidade, idTipoLocal) "+
				"values(?,?,?,?,?)";
		try(Connection conn = ConnectionFactory.getConexao();
				PreparedStatement pst = conn.prepareStatement(sqlInsert);){
			pst.setString(1, local.getNome());
			pst.setDouble(2, local.getLatitude());
			pst.setDouble(3, local.getLongitude());
			pst.setInt(4, local.getCidade());
			pst.setInt(5, local.getTipo());
			pst.execute();
			String query = "select last_insert_id()";
			try(PreparedStatement pst2 = conn.prepareStatement(query);
					ResultSet rs = pst2.executeQuery();){
				if(rs.next()){
					local.setId(rs.getInt(1));
				}
			}catch(SQLException e){
				e.printStackTrace();
				throw new IOException(e);
			}
		} catch(SQLException e){
			e.printStackTrace();
			throw new IOException(e);
		}
		return local;  
	}
	
	public Local selecionar(int id) throws IOException {
		String query = "select l.idlocal, l.nmlocal, l.latitude, l.longitude, "+
				"l.idCidade, c.nmCidade, c.idUf, l.idTipoLocal, t.nmTipoLocal "+ 
				"from local l, cidade c, tipolocal t where l.idCidade = c.idCidade "+
				"and l.idTipoLocal = t.idTipoLocal and l.idlocal=?";
		Local local = new Local();
		try(Connection conn = ConnectionFactory.getConexao();
				PreparedStatement pst = conn.prepareStatement(query);){
			pst.setInt(1,id);
			try(ResultSet rs = pst.executeQuery();){
				if(rs.next()){
					local.setId(id);
					local.setNome(rs.getString("nmlocal"));
					local.setLatitude(rs.getDouble("latitude"));
					local.setLongitude(rs.getDouble("longitude"));
					local.setCidade(rs.getInt("idCidade"));
					local.setTipo(rs.getInt("idTipoLocal"));
					local.setNomeCidade(rs.getString("nmCidade") + " - " + rs.getString("idUf"));
					local.setNomeTipo(rs.getString("nmTipoLocal"));
				}
			}catch(SQLException e){
				e.printStackTrace();
				throw new IOException(e);
			}
		} catch(SQLException e){
			e.printStackTrace();
			throw new IOException(e);
		}
		return local;
	}
}
