import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    	
		int flag = 0;
		double media = 0.0;
		while (flag != 2) {
    		double valor = Double.parseDouble(input.readLine());
    		if (valor >= 0 && valor <= 10) {
    			media += valor;
    			flag++;
    		} else {
    			System.out.println("nota invalida");
    		}
		}
		System.out.println("media = " + (media / 2));
  	}
}
