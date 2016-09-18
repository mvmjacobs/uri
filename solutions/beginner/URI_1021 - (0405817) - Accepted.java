import java.io.*;
import java.text.DecimalFormat;
import java.lang.Math;
   
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.000");
        String sdf;
         
        double n = Double.parseDouble(input.readLine());
        double cont100 = 0, cont50 = 0, cont20 = 0, cont10 = 0, cont5 = 0, cont2 = 0, cont1 = 0, cont050 = 0, cont025 = 0, cont010 = 0, cont005 = 0, cont001 = 0;
        if ((n > 0) && (n < 1000000.00)) {
            // CEDULAS
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
            
            // MOEDAS
            if ((n / 1) > 0) {
                cont1 = n / 1;
                n = n % 1;
            }
            if ((n / 0.50) > 0) {
                cont050 = n / 0.50;
                n = n % 0.50;
            }
            if ((n / 0.25) > 0) {
                cont025 = n / 0.35;
                n = n % 0.25;
            }
            if ((n / 0.10) > 0) {
                cont010 = n / 0.10;
                n = n % 0.10;
            }
            if ((n / 0.05) > 0) {
                cont005 = n / 0.05;
                n = n % 0.05;
            }
            if ((n / 0.01) > 0) {
                cont001 = n / 0.01;
                n = n % 0.01;
            }
            
        }
         
        System.out.println("NOTAS:");
        System.out.printf("%.0f nota(s) de R$ 100.00\n", Math.floor(cont100));
        System.out.printf("%.0f nota(s) de R$ 50.00\n", Math.floor(cont50));
        System.out.printf("%.0f nota(s) de R$ 20.00\n", Math.floor(cont20));
        System.out.printf("%.0f nota(s) de R$ 10.00\n", Math.floor(cont10));
        System.out.printf("%.0f nota(s) de R$ 5.00\n", Math.floor(cont5));
        System.out.printf("%.0f nota(s) de R$ 2.00\n", Math.floor(cont2));
        
        System.out.println("MOEDAS:");
        System.out.printf("%.0f moeda(s) de R$ 1.00\n", Math.floor(cont1));
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", Math.floor(cont050));
        System.out.printf("%.0f moeda(s) de R$ 0.25\n", Math.floor(cont025));
        System.out.printf("%.0f moeda(s) de R$ 0.10\n", Math.floor(cont010));
        System.out.printf("%.0f moeda(s) de R$ 0.05\n", Math.floor(cont005));
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", Math.floor(cont001));
        
   	    }
}