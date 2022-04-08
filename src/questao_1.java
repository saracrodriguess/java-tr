import java.util.Scanner;

public class questao_1 {
	public static void main(String[] args) {
		System.out.println("digite o valor do raio");
		Scanner scan = new Scanner (System.in);

		double raio = scan.nextFloat();
		double area = Math.PI * raio * raio;

		System.out.println("o valor da área é: "+ area);

	}
	
}
