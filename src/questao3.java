
public class questao3 {
	public static void main(String[] args) {
	
		int a = 3;
	    int b = -15;
	    int c = 12;
	    
	    double delta = Math.pow(b, 2.0) - 4*a*c;
	    double x1 = (- b + Math.sqrt(delta))/(2.0*a);
	    double x2 = (- b - Math.sqrt(delta))/(2.0*a);
	    System.out.println(x1);
	    System.out.println(x2);
	}
}
