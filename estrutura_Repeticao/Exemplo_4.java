package estrutura_Repeticao;
import java.util.Scanner;

public class Exemplo_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int num = input.nextInt();
		while (num > 0){
		System.out.println("Dobro: " + (num * 2));
		System.out.println("Digite um número: ");
		num = input.nextInt();
		}
		
		input.close();
	}

}
