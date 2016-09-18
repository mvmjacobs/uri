import java.io.*;
import java.text.DecimalFormat;
import java.lang.Math;
   
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.0");
        String sdf;
        
        String entrada = input.readLine();
        String[] valores = entrada.split(" ");
        double a = Double.parseDouble(valores[0]);
        double b = Double.parseDouble(valores[1]);
        double c = Double.parseDouble(valores[2]);
        
        if (((b-c) < a) && ((b+c) > a) && ((a-c) < b) && ((a+c) > b) && ((a-b) < c) && ((a+b) > c)) {
        	System.out.println("Perimetro = " + (a + b + c));
        } else {
        	System.out.println("Area = " + (((a + b) * c) / 2));
        }
        
   	}
}