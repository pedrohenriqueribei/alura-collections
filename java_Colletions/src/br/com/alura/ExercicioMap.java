package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

	public static void main(String[] args) {

		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");
		//...

		for (Map.Entry<Integer, String> entry : pessoas.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(val+" "+key);
		}
		
		
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        for (Map.Entry<String, Integer> nome : nomesParaIdade.entrySet()) {
			String key = nome.getKey();
			Integer val = nome.getValue();
			System.out.println(val+" "+key);
		}
	}


}
