package controllers;

import java.util.List;

import models.Projeto;
import play.mvc.Controller;

public class Projetos extends Controller {

	public static void detalhar(Projeto projeto) {
		render(projeto);
	}
	public static void salvar(Projeto projeto) {
		projeto.save();
		detalhar(projeto);
		}
	public static void form() {
		render();
	}

	public static void listar() {
		List<Projeto> projetos = Projeto.findAll();
		render(projetos);
	}

}
