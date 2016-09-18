import java.io.*;
import java.text.DecimalFormat;
import java.lang.Math;
   
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.0000");
         
        int maior;
        String aux;
        String entp1 = input.readLine();
        String p1[] = entp1.split(" ");
        String entp2 = input.readLine();
        String p2[] = entp2.split(" ");
        double x1 = Double.parseDouble(p1[0]);
        double y1 = Double.parseDouble(p1[1]);
        double x2 = Double.parseDouble(p2[0]);
        double y2 = Double.parseDouble(p2[1]);
                 
        double valor = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        aux = df.format(valor);
        aux = aux.replaceAll(",", ".");
        System.out.println(aux);
         
        }
}