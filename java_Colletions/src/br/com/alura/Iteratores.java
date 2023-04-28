package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class Iteratores {

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
		
		Aluno a1 = new Aluno("Pedro Henrique", 23487);
		Aluno a2 = new Aluno("Maria Fernanda", 23784);
		Aluno a3 = new Aluno("Juliana Moraes", 64645);
		
		colecoes.matricula(a1);
		colecoes.matricula(a2);
		colecoes.matricula(a3);
		
		//jeito antigo de buscar os elementos (por iterator)
		Set<Aluno> alunos = colecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()) {
			Aluno next  = iterador.next();
			System.out.println(next);
		}
		
//		for(Aluno a : colecoes.getAlunos()) {
//			System.out.println(a);
//		}
	}

}
