package estrutura_Repeticao;
import java.util.Scanner;

public class Exemplo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, senha;
		Scanner input = new Scanner (System.in);
		do {
		System.out.println("Digite o nome: ");
		nome = input.next();
		System.out.println("Digite a senha: ");
		senha = input.next();
		if (nome.equalsIgnoreCase(senha))
		System.out.println("O nome não pode ser igual à senha!!");
		} while (nome.equalsIgnoreCase(senha));
		System.out.println("Dados válidos!!");
		
		input.close();
	}

}
