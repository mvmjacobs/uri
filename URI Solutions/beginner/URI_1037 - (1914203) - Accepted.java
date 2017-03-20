import java.io.*;
import java.text.DecimalFormat;
import java.lang.Math;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.00000");
        String sdf;
         
        double valor = Double.parseDouble(input.readLine());
         
        if ((valor >= 0) && (valor <= 100 )) {
            if ((valor >= 0) && (valor <= 25)) {
                System.out.println("Intervalo [0,25]");
            } else if ((valor > 25) && (valor <= 50)) {
                System.out.println("Intervalo (25,50]");
            } else if ((valor > 50) && (valor <= 75)) {
                System.out.println("Intervalo (50,75]");
            } else {
                System.out.println("Intervalo (75,100]");
            }
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}