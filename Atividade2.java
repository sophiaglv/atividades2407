package revisao;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> par = new ArrayList<>();
		int num;

		do {
			System.out.println("Informe um número (Digite zero para terminar): ");
			num = ler.nextInt();
			par.add(num);
		}while (num != 0);

		System.out.println("Os números pares são: ");

		for (int i : par) {
			if (i %2 == 0 && i != 0) {
				System.out.println(i);
			}
		}
		ler.close();
	}

}
