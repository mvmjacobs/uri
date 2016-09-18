import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        
        String entrada = input.readLine();
        String[] valores = entrada.split(" ");
        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        
        if (a > b) {
        	if ((a % b) == 0) {
        		System.out.println("Sao Multiplos");
        	} else {
        		System.out.println("Nao sao Multiplos");
        	}
        } else {
        	if ((b % a) == 0) {
        		System.out.println("Sao Multiplos");
        	} else {
        		System.out.println("Nao sao Multiplos");
        	}
        }
   	}
}