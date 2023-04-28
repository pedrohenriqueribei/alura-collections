package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TrabalhandoComSet {

	public static void main(String[] args) {

		//não garante a ordem
		//trabalha mais rápido
		//garante a não repetição
		Set<String> alunos = new HashSet<>();

		alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");
        
        for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}

}
