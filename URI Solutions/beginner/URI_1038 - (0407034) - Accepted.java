import java.io.*;
import java.text.DecimalFormat;
import java.lang.Math;
   
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        String sdf;
        
        String entrada = input.readLine();
		String valor[] = entrada.split(" ");
		int cod = Integer.parseInt(valor[0]);        
		int qtd = Integer.parseInt(valor[1]);
		double total = 0.00;
		
		switch (cod) {
			case 1:
				total = qtd * 4.00;
				break;
			case 2:
				total = qtd * 4.50;
				break;
			case 3:
				total = qtd * 5.00;
				break;
			case 4:
				total = qtd * 2.00;
				break;
			case 5:
				total = qtd * 1.50;
				break;
		}
		sdf = df.format(total);
		System.out.println("Total: R$ " + (sdf.replaceAll(",", ".")));
		        
   	}
}