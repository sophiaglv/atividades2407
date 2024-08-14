package revisao;
import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int venda = 0, num;

		for (int i = 0; i <=3; i++) {
			System.out.println("Informe o numero de venda da semana: ");
			num = ler.nextInt();
			venda = num + venda;
		}
		System.out.print("O número total de vendas do mês é: " + venda + ", ");

		switch (venda) {
		case 0:
			System.out.println("sem bônus");
			break;
		case 1:
			System.out.println("sem bônus");
			break;
		case 2:
			System.out.println("sem bônus");
			break;
		case 3:
			System.out.println("sem bônus");
			break;
		case 4:
			System.out.println("sem bônus");
			break;
		case 5:
			System.out.println("sem bônus");
			break;
		case 6:
			System.out.println("sem bônus");
			break;
		case 7:
			System.out.println("sem bônus");
			break;
		case 8:
			System.out.println("sem bônus");
			break;
		case 9:
			System.out.println("sem bônus");
			break;
		case 10:
			System.out.println("sem bônus");
			break;
		case 11:
			System.out.println("bônus de R$100,00");
			break;
		case 12:
			System.out.println("bônus de R$100,00");
			break;
		case 13:
			System.out.println("bônus de R$100,00");
			break;
		case 14:
			System.out.println("bônus de R$100,00");
			break;
		case 15:
			System.out.println("bônus de R$100,00");
			break;
		case 16:
			System.out.println("bônus de R$300,00");
			break;
		case 17:
			System.out.println("bônus de R$300,00");
			break;
		case 18:
			System.out.println("bônus de R$300,00");
			break;
		case 19:
			System.out.println("bônus de R$300,00");
			break;
		case 20:
			System.out.println("bônus de R$300,00");
			break;
		default:
			System.out.println("bônus de R$500,00");
		}
		ler.close();
	}

}
