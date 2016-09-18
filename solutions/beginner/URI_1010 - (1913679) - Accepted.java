import java.io.*;
import java.text.DecimalFormat;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.00");
                  
        String p, e;
        double total = 0.0;
       	
       	for (int i = 0; i < 2; i++) {
       		p = input.readLine();
       		String aux[] = p.split(" ");
       		total += Double.parseDouble(aux[1]) * Double.parseDouble(aux[2]);
       	}
        
        e = df.format(total);
        e = e.replaceAll(",", ".");
         
        System.out.println("VALOR A PAGAR: R$ " + e);
    }
}