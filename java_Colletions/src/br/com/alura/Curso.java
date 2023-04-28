package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public int getTempoTotal() {
		int total = 0;
		for (Aula aula : aulas) {
			total  += aula.getTempo();
		}
		return total;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}
	
	//retornar uma lista não modificavel
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	@Override
	public String toString() {
		return "Curso: "+nome+ "- Instrutor: "+ instrutor +" - tempo total: "+ this.getTempoTotal()+" min" +
				"\n{Aulas: "+ this.getAulas()+"}";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaPorMatricula(int mat) {
		return matriculaAluno.get(mat);
//		jeito tradicional
//		for (Aluno aluno : alunos) {
//			if(aluno.getNumeroMatricula() == mat) {
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException("Matricula não encontrada: "+ mat); 
	}

	
}
