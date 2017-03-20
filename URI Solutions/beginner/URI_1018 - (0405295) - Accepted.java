import java.io.*;
import java.text.DecimalFormat;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.000");
		String sdf;
		
		int n = Integer.parseInt(input.readLine());
		int valor = n;
		int cont100 = 0, cont50 = 0, cont20 = 0, cont10 = 0, cont5 = 0, cont2 = 0, cont1 = 0;
		
		if ((n > 0) && (n < 1000000.00)) {
			if ((n / 100) > 0) {
				cont100 = n / 100;
				n = n % 100;
			}
			if ((n / 50) > 0) {
				cont50 = n / 50;
				n = n % 50;
			}
			if ((n / 20) > 0) {
				cont20 = n / 20;
				n = n % 20;
			}
			if ((n / 10) >  0) {
				cont10 =  n / 10;
				n = n % 10;
			}
			if ((n / 5) > 0) {
				cont5 = n / 5;
				n = n % 5;
			}
			if ((n / 2) > 0) {
				cont2 = n / 2;
				n = n % 2;
			}
			if ((n / 1) > 0) {
				cont1 = n / 1;
				n = n % 2;
			}
		}
		
		System.out.println(valor);
		System.out.println(cont100 + " nota(s) de R$ 100,00");
		System.out.println(cont50 + " nota(s) de R$ 50,00");
		System.out.println(cont20 + " nota(s) de R$ 20,00");
		System.out.println(cont10 + " nota(s) de R$ 10,00");
		System.out.println(cont5 + " nota(s) de R$ 5,00");
		System.out.println(cont2 + " nota(s) de R$ 2,00");
		System.out.println(cont1 + " nota(s) de R$ 1,00");
	}
}