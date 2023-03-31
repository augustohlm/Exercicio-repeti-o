package estrutura_Repeticao;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, x;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Digite um numero: ");
			x = sc.nextInt();
			if(x < 0) {
				cont++;
			}
	
		}
		System.out.print("Foram lidos " + cont + " numero negativos");
		sc.close();
	}

}
