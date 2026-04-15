package controllers;

import models.Projeto;
import play.mvc.Controller;

public class Projetos extends Controller {

	public static void detalhar(Projeto projeto) {
		render(projeto);
	}
	public static void salvar(Projeto projeto) {
		projeto.nome = projeto.nome;
		projeto.descricao = projeto.descricao;
		projeto.save();
		detalhar(projeto);
		}
	public static void form() {
		render();
	}

}
