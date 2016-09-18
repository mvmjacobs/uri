import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int a = 0, g = 0, d = 0, n = 0;
		while (n != 4) {
			n = Integer.parseInt(input.readLine());
			if (n == 1) {
				a++;
			} else if (n == 2) {
				g++;
			} else if (n == 3) {
				d++;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);
		
  	}
}
