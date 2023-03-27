import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha invalida");
			
			System.out.print("Informe a Senha novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
