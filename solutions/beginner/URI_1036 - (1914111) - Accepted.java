import java.io.*;
import java.text.DecimalFormat;
import java.lang.Math;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.00000");
        String sdf;
         
         
        String entrada = input.readLine();
        String valores[] = entrada.split(" ");
        double A = Double.parseDouble(valores[0]);
        double B = Double.parseDouble(valores[1]);
        double C = Double.parseDouble(valores[2]);
        double delta = B * B - 4 * A * C;
                
        if (delta > 0 && A != 0) {
	        double R1 = (-B + (Math.sqrt(delta))) / (2 * A);
			double R2 = (-B - (Math.sqrt(delta))) / (2 * A);
        
            String x1 = df.format(R1);
            x1 = x1.replaceAll(",", ".");
            String x2 = df.format(R2);
            x2 = x2.replaceAll(",", ".");
            
            R1 = Double.parseDouble(x1);
            R2 = Double.parseDouble(x2);            
             
            System.out.println("R1 = " + R1);
            System.out.println("R2 = " + R2);
             
        } else {
            System.out.println("Impossivel calcular");
        }
 
 
    }
}