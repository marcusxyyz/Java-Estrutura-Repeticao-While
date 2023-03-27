import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eixo X: ");
		double x = sc.nextDouble();
		System.out.print("Eixo Y: ");
		double y = sc.nextDouble();
		
		while(x != 0 && y != 0) {
			System.out.println();
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else {
				System.out.println("Quarto");
			}
			
			System.out.println();
			
			System.out.print("Eixo X: ");
			x = sc.nextDouble();
			System.out.print("Eixo Y: ");
			y = sc.nextDouble();
		}
		
		
		sc.close();
	}

}
