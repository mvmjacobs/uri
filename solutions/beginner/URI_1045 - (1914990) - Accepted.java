import java.io.*;
   
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
         
        String entrada = input.readLine();
        String[] parcial = entrada.split(" ");
        double valores[] = new double[parcial.length];
        double x;
         
        for (int i = 0; i < parcial.length; i++) {
            valores[i] = Double.parseDouble(parcial[i]);
        }
         
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                if (valores[i] > valores[j]) {
                    x = valores[i];
                    valores[i] = valores[j];
                    valores[j] = x;
                }
            }
        }
         
        double a = valores[0];
        double b = valores[1];
        double c = valores[2];
         
        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((a * a) == ((b * b) + (c * c))) {
                System.out.println("TRIANGULO RETANGULO");
            }
             
            if ((a * a) > ((b * b) + (c * c))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
 
            if ((a * a) < ((b * b) + (c * c))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
 
            if ((a == b) && (b == c)) {
                System.out.println("TRIANGULO EQUILATERO");
            }
 
            if (((a == b) || (b == c) || (a == c)) && !((a == b) && (b == c))) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
         
         
         
    }
}