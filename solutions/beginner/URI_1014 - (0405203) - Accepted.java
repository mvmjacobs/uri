import java.io.*;
import java.text.DecimalFormat;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.000");
        
        int X;
        float Y, total;
        String aux;
		
		X = Integer.parseInt(input.readLine());
		Y = Float.parseFloat(input.readLine());
		total = X / Y;
		aux = df.format(total);
		aux = aux.replaceAll(",", ".");
		
		System.out.println(aux + " km/l");
		
	    }
}