import java.io.*;
import java.text.DecimalFormat;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.000");
		String sdf;
		
		int tempo = Integer.parseInt(input.readLine()); 
		int velocidade = Integer.parseInt(input.readLine()); 
		
		Double distancia = (tempo * velocidade) / 12.0;
		sdf = df.format(distancia);
		sdf = sdf.replaceAll(",", ".");
		
		System.out.println(sdf);
		        
		
	    }
}