import java.util.Scanner;
public class questao_2 {
public static void main(String[] args) {
	System.out.println("calculadora de área");
	System.out.println("diga qual objeto quer calcular: ");

	Scanner input = new Scanner(System.in);

	/*..boolean triangulo_retangulo = true;..*/
	/*..boolean circulo = true;..*/
	boolean trapezio = true;
	/*..boolean quadrado = true;..*/
	/*..boolean retangulo = true;..*/

	/*..if(triangulo_retangulo){
	Double A, C, T;
	System.out.println("digite o valor de A = base: ");
	A = input.nextDouble();
	System.out.println("digite o valor de C = altura: ");
	C = input.nextDouble();
	T = (A*C)/2;
	System.out.println("a área do triângulo é: "+ T);
	input.close();
	}..*/

	/*..if(circulo){
	Double C, A;
	System.out.println("digite o valor de C = raio: ");
	C = input.nextDouble();
	A = Math.PI * C * C;
	System.out.println("a área do círculo é: "+ A);
	input.close();
	}..*/

	if(trapezio){
	Double A, B, C, T;
	System.out.println("digite o valor de A = base maior: ");
	A = input.nextDouble();
	System.out.println("digite o valor de B = base menor: ");
	B = input.nextDouble();
	System.out.println("digite o valor de C = altura: ");
	C = input.nextDouble();
	T = ((A+B)/2)*C;
	System.out.println("a área do trapézio é: "+ T);
	input.close();
	}

	/*..if(quadrado){
	Double B, A;
	System.out.println("digite o valor de B = lado: ");
	B = input.nextDouble();
	A = B * B;
	System.out.println("a área do quadrado é: "+ A);
	input.close();
	}

	if(retangulo){
	Double A, B, R;
	System.out.println("digite o valor de A = base: ");
	A = input.nextDouble();
	System.out.println("digite o valor de B = altura: ");
	B = input.nextDouble();
	R = A * B;
	System.out.println("a área do retângulo é: "+ R);
	input.close();
	}..*/

}
}
