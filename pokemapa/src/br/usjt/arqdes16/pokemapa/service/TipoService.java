package br.usjt.arqdes16.pokemapa.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqdes16.pokemapa.dao.TipoDAO;
import br.usjt.arqdes16.pokemapa.model.Tipo;

public class TipoService {
	private TipoDAO dao;
	
	public TipoService(){
		dao = new TipoDAO();
	}
	public ArrayList<Tipo> listarTipos() throws IOException{
		return dao.selecionarTodos();
	}
}
