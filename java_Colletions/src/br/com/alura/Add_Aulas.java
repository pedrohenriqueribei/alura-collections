package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_Aulas {

	public static void main(String[] args) {

		Curso colecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		colecoes.adiciona(new Aula("Trabalhando com ArrayList", 25));
		colecoes.adiciona(new Aula("Lista de Objetos", 19));
		colecoes.adiciona(new Aula("Relacionamentos com coleções", 24));
		colecoes.adiciona(new Aula("Mais prática com relacionamentos", 17));
		colecoes.adiciona(new Aula("O poder dos sets", 19));
		colecoes.adiciona(new Aula("Aplicando o Set no modelo", 11));
		colecoes.adiciona(new Aula("Equals e hashcode", 21));
		colecoes.adiciona(new Aula("Outros Sets e iterators", 12));
		colecoes.adiciona(new Aula("Qual Collections usar", 8));
		colecoes.adiciona(new Aula("Mapas", 18));

		System.out.println("Lista de aulas ordenadas");
		List<Aula> aulasImutaveis = colecoes.getAulas();
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		
		System.out.println("Tempo total de aulas: " + colecoes.getTempoTotal() + " min");
		
		System.out.println("\n");
		
		System.out.println(colecoes);
	}

}
