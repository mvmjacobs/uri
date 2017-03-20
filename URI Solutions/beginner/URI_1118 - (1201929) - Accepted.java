import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	    DecimalFormat df = new DecimalFormat("0.00");
        String sdf;

    	
		int flag = 0;
		double media = 0.0;
		while (flag <= 2) {
    		double valor = Double.parseDouble(input.readLine());
    		if (valor >= 0 && valor <= 10) {
    			media += valor;
    			flag++;
    			if (flag == 2) {
					System.out.println("media = " + df.format((media / 2)).replace(",", "."));
					media = 0.0;
    				flag = 0;
	    			while (flag < 1 || flag > 2) {
	    				System.out.println("novo calculo (1-sim 2-nao)");
	    				flag = Integer.parseInt(input.readLine());
	    				if (flag == 2) {
	    					flag = 40;
	    					break;
	    				}
	    			}
	    			if (flag != 40) {
		    			flag = 0;
	    			}
    			}
    		} else {
    			System.out.println("nota invalida");
    		}
		}
  	}
}
