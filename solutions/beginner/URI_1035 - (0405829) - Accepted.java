import java.io.*;
import java.text.DecimalFormat;
import java.lang.Math;
   
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.000");
        String sdf;
        
        String entrada = input.readLine();
        String valores[] = entrada.split(" ");
        int A = Integer.parseInt(valores[0]);
        int B = Integer.parseInt(valores[1]);
        int C = Integer.parseInt(valores[2]);
        int D = Integer.parseInt(valores[3]);
        
        if ((B > C) && (D > A)) {
        	if ((C + D) > (A + B)) {
        		if ((C > 0) && (D > 0)) {
        			if ((A % 2) == 0) {
        				System.out.println("Valores aceitos");
        			} else {
        				System.out.println("Valores nao aceitos");        				
        			}
        		} else {
        			System.out.println("Valores aceitos");
        		}
        	} else {
        		System.out.println("Valores nao aceitos");        				
        	}
        } else {
 			System.out.println("Valores nao aceitos");        				
        }
   	}
}