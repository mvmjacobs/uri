import java.io.*;
import java.text.DecimalFormat;
import java.lang.Math;
   
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.000");
         
        int maiorAB, maior;
        String entrada = input.readLine();  
        String vetor[] = entrada.split(" ");
        int a = Integer.parseInt(vetor[0]);
        int b = Integer.parseInt(vetor[1]);
        int c = Integer.parseInt(vetor[2]);
        maiorAB = (a + b + Math.abs(a-b)) / 2;
        
        maior = (maiorAB + c + Math.abs(maiorAB-c)) / 2;
        
        System.out.println(maior + " eh o maior");
         
        }
}