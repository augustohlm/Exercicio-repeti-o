package estrutura_Repeticao;
import java.util.Scanner;

public class Exemplo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		int num;
		String op;
		do{
		System.out.println("Digite um número: ");
		num = input.nextInt();
		System.out.println("Dobro do número: " + (num * 2));
		System.out.println("Deseja continuar? (S)im ou (N)ão");
		op = input.next();
		} while (op.equalsIgnoreCase("S"));
		
		input.close();
	}
		
		
	
}
