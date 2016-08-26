package br.usjt.arqdes16.pokemapa.service;

import java.io.IOException;

import br.usjt.arqdes16.pokemapa.dao.LocalDAO;
import br.usjt.arqdes16.pokemapa.model.Local;

public class LocalService {
	private LocalDAO dao;
	
	public LocalService() {
		this.dao = new LocalDAO();
	}
	public Local criar(Local local) throws IOException{
		return dao.criar(local);
	}
	public Local buscar(int id) throws IOException{
		return dao.selecionar(id);
	}
}
