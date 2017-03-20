import java.io.*;
import java.text.DecimalFormat;
import java.lang.Math;
   
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        String sdf;
        
        String entrada = input.readLine();
        String[] xy = entrada.split(" ");
        double x = Double.parseDouble(xy[0]);
        double y = Double.parseDouble(xy[1]);
        
        if ((x == 0) && (y == 0)) {
        	System.out.println("Origem");
        } else if ((x != 0) && (y == 0)) {
        	System.out.println("Eixo X");
        } else if ((x == 0) && (y != 0)) {
        	System.out.println("Eixo Y");
        } else if ((x > 0) && (y > 0)) {
        	System.out.println("Q1");
        } else if ((x < 0) && (y > 0)) {
        	System.out.println("Q2");
        } else if ((x < 0) && (y < 0)) {
        	System.out.println("Q3");
        } else if ((x > 0) && (y < 0)) {
        	System.out.println("Q4");
        }
        
        
   	}
}