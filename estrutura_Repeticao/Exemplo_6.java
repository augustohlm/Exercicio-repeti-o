package estrutura_Repeticao;
import java.util.Scanner;


public class Exemplo_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, soma = 0;
		
		System.out.print("Digite uma idade");
		int idade = sc.nextInt();
		
		while(idade > 0) {
			cont ++;
		soma = soma + idade;
		
		System.out.print("Digite uma idade");
		idade = sc.nextInt();
		}
		if (cont > 0) {
			System.out.format("\n Foram informadas %d idades ", cont);
			System.out.format("\n A media das idades foi %.2f \n", (double)soma/cont);
		} else {
			System.out.print("\n Nenhuma idade foi informada!");
		}
		
	sc.close();	
	}

}
