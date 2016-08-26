package br.usjt.arqdes16.pokemapa.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.arqdes16.pokemapa.model.Cidade;
import br.usjt.arqdes16.pokemapa.model.Local;
import br.usjt.arqdes16.pokemapa.model.Tipo;
import br.usjt.arqdes16.pokemapa.service.CidadeService;
import br.usjt.arqdes16.pokemapa.service.LocalService;
import br.usjt.arqdes16.pokemapa.service.TipoService;

@Controller
public class MapeamentoController {

	@RequestMapping("/")
	public String form(HttpServletRequest request) {

		TipoService ts = new TipoService();
		CidadeService cs = new CidadeService();
		try {
			request.setCharacterEncoding("UTF-8");
			ArrayList<Tipo> tipos = ts.listarTipos();
			request.setAttribute("tipos", tipos);
			ArrayList<Cidade> cidades = cs.listarCidades();
			request.setAttribute("cidades", cidades);
			return "local/criar_local";

		} catch (IOException e) {
			e.printStackTrace();
		}
		return "erro";
	}

	@RequestMapping("/incluir_local")
	public String inclusao(Local local, HttpServletRequest request) {
		LocalService ls = new LocalService();
		try {
			request.setCharacterEncoding("UTF-8");
			ls.criar(local);
			Local novolocal = ls.buscar(local.getId());
			request.setAttribute("novo_local", novolocal);

			return "local/mostrar_local";
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "erro";
	}
}
