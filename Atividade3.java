package revisao;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> positivo = new ArrayList<>();
		int num;

		do {
			System.out.println("Informe um número (Digite zero para terminar): ");
			num = ler.nextInt();
			positivo.add(num);
		}while (num != 0);

		System.out.println("Os números positivos são: ");

		for (int i : positivo) {
			if (i > 0 && i != 0) {
				System.out.println(i);
			}
		}
		ler.close();

	}

}
