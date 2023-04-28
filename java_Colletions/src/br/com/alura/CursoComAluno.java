package br.com.alura;

public class CursoComAluno {

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
		
		colecoes.getAlunos().forEach(aluno ->
				System.out.println(aluno)
		);
		
		System.out.println(colecoes.estaMatriculado(a1));
		
		
		
	}

}
