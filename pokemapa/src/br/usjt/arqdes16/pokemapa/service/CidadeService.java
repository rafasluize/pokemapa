package br.usjt.arqdes16.pokemapa.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqdes16.pokemapa.dao.CidadeDAO;
import br.usjt.arqdes16.pokemapa.model.Cidade;

public class CidadeService {
	private CidadeDAO dao;
	
	public CidadeService(){
		dao = new CidadeDAO();
	}
	public ArrayList<Cidade> listarCidades() throws IOException{
		return dao.selecionarTodas();
	}
}
