import java.io.*;
import java.text.DecimalFormat;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0");
		String sdf;
		
		int dist = Integer.parseInt(input.readLine()); 
		
		Double diferenca = ((dist * 2) * 0.5) * 2;
		sdf = df.format(diferenca);
		
		System.out.println(sdf + " minutos");
		        
		
	    }
}