import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String sdf;
        double total = 0, aux = 0;
        double valor = input.nextDouble();
        
        if (valor <= 2000) {
        	System.out.println("Isento");
        } else {
        	if (valor > 4500) {
        		aux = valor - 4500;
        		total += aux * 0.28;
        		valor -= aux;
        	}
        	
        	if (valor > 3000) {
        		aux = valor - 3000;
        		total += aux * 0.18;
        		valor -= aux;
        	}
        	
        	if (valor > 2000){
        		aux = valor - 2000;
        		total += aux * 0.08;
        	}
        }
        
        if (total > 0) {
        	sdf = df.format(total);
        	System.out.println("R$ " + sdf.replaceAll(",", "."));
        }
   	}
}