package revisao;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> num = new ArrayList<>();
		int i, soma = 0;

		do {
			System.out.println("Informe um número (Digite zero para terminar): ");
			i = ler.nextInt();
			num.add(i);
		}while (i != 0);

		for (int a : num) {
			soma += a;
		}
		System.out.println("O resultado da soma é: " + soma);
		ler.close();
	}

}
