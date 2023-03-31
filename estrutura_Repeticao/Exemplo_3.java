package estrutura_Repeticao;
import java.util.Scanner;

public class Exemplo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Scanner input = new Scanner (System.in);
		do {
		System.out.println("(1) - Soma "
		+ "\n(2) - Subtrair"
		+ "\n(3) - Multiplicar"
		+ "\n(4) - Dividir"
		+ "\n(5) - Sair");
		opcao = input.nextInt();
		switch (opcao){
		case 1: System.out.println("Você escolheu a opção 1"); break;
		case 2: System.out.println("Você escolheu a opção 2"); break;
		case 3: System.out.println("Você escolheu a opção 3"); break;
		case 4: System.out.println("Você escolheu a opção 4"); break;
		case 5:System.out.println( "Fim do Programa!!"); break;
		default: System.out.println("Opção inválida!!");
		}
		} while (opcao != 5);
		
		input.close();
	}

}
