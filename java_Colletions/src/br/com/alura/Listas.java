package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class Listas {
	
	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de Listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		String aula4 = "Adicionando elementos em um ArrayList";
		String aula5 = "Removendo elementos em um ArrayList";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		aulas.add(aula5);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		aulas.forEach(aula -> {System.out.println(aula);});
	}

}
