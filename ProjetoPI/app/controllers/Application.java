package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

public class Application extends Controller {

    public static void index() {
        renderText("Bem vindo ao Play!");
    }

    public static void teste() {
        render();
    }

}