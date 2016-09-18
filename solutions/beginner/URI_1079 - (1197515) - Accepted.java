import java.io.*;
import java.text.DecimalFormat;


public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.0");
        String sdf;

        int n = Integer.parseInt(input.readLine());
        double total = 0;
        String valor;
        double aux[] = new double[3];
        for (int i = 0; i < n; i++) {
        	valor = input.readLine();
        	String s[] = valor.split(" ");
        	aux[0] = Double.parseDouble(s[0]);
        	aux[1] = Double.parseDouble(s[1]);
        	aux[2] = Double.parseDouble(s[2]);
        	sdf = df.format(((aux[0] * 2) + (aux[1] * 3) + (aux[2] * 5)) / 10);
        	System.out.println(sdf.replace(",", "."));
        }
   	}
}
