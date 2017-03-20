import java.io.*;
   
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
         
        String entrada = input.readLine();
        String[] valores = entrada.split(" ");
 
        int hi = Integer.parseInt(valores[0]);
        int hf = Integer.parseInt(valores[1]);
 		int t = ((24 - hi) + hf) > 24 ? (hf - hi) : ((24 - hi) + hf);
        System.out.println("O JOGO DUROU " + t + " HORA(S)");
 
    }
}