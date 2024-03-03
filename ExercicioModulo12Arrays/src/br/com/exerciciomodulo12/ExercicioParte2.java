package br.com.exerciciomodulo12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1 - Ler do console o nome de uma pessoa e o sexo.
 * 2 - Exemplo: Jose-M, Maria-F, Joao-M, Lucas-m, Joana-F;
 * 3 - Separa-los por grupos(genero) e imprimir no console a resposta 
 * com os grupos separados.
 */

public class ExercicioParte2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite nomes e sexo separados por virgula:");
		System.out.println("Exemplo: João-m,maria-f,...");
		
		String stringDigitada = sc.nextLine();
		String[] palavras = stringDigitada.split(",");
		
		List<String> masculinos = new ArrayList<>();
		List<String> femininos = new ArrayList<>();
		
		for (int i = 0; i < palavras.length; i++) {
			if (palavras[i].contains("m")) {
				masculinos.add(palavras[i]);
			} else {
				femininos.add(palavras[i]);
			}
		}
		Collections.sort(masculinos);
		Collections.sort(femininos);
		
		System.out.println("Lista ordenada masculina: \n" + masculinos);
		System.out.println("Lista ordenada feminina: \n" + femininos);

		sc.close();
		
	}

}
