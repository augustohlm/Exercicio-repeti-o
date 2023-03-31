package estrutura_Repeticao;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n = input.nextInt();
		for (int i = 1; i <= 10; i++)
		System.out.println(n + " x " + i + " = " + (n*i));

		//ou
		for (int i = 1; i <= 10; i++)

		System.out.format("%d x %d = %d\n", n, i, (n*i));
	input.close();
	}

}
