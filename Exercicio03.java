import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("Codigo	Tipo\n"
				+ "1	Alcool\n"
				+ "2	Gasolina\n"
				+ "3	Diesel\n"
				+ "4	Fim");
		
		System.out.println("Informe o codigo do combustivel: ");
		int codigo = sc.nextInt();
		
		
		while (codigo != 4) {
			
			switch(codigo) {
				case 1:
					alcool += 1;
					break;
				case 2:
					gasolina += 1;
					break;
				case 3:
					diesel += 1;
					break;
			}
			
			codigo = sc.nextInt();
			
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: "+ diesel);
		
		sc.close();
	}

}
