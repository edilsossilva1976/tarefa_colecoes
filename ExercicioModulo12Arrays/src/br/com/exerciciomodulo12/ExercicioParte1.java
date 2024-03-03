package br.com.exerciciomodulo12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1 - Ler do console nomes separados por virgula,
 * 2 - Guardar em uma variavel,
 * 3 - Ordenar os nomes em ordem alfabetica e imprimir no console. 
 * 4 - Utilizar Split
 */
public class ExercicioParte1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite nomes separados por virgula:");
		String stringDigitada = sc.nextLine();
		String[] nomes = stringDigitada.split(",");
		
		List<String> lista = new ArrayList<>();
		
		for (int i = 0; i < nomes.length; i++) {
			lista.add(nomes[i]);
		}
		
		Collections.sort(lista);
		System.out.println(lista);

		sc.close();
	}
}
