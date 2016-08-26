package br.usjt.arqdes16.pokemapa.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.usjt.arqdes16.pokemapa.model.Tipo;

public class TipoDAO {
	public ArrayList<Tipo> selecionarTodos() throws IOException {
		String query = "select idTipoLocal, nmTipoLocal from tipolocal";
		ArrayList<Tipo> lista = new ArrayList<>();
		Tipo tipo;
		try (Connection conn = ConnectionFactory.getConexao();
				PreparedStatement pst = conn.prepareStatement(query);
				ResultSet rs = pst.executeQuery();) {
			while (rs.next()) {
				tipo = new Tipo();
				tipo.setId(rs.getInt("idTipoLocal"));
				tipo.setNome(rs.getString("nmTipoLocal"));
				lista.add(tipo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new IOException(e);
		}
		return lista;
	}
}
