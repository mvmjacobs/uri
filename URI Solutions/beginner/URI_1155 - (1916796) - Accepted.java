import java.io.*;
import java.text.DecimalFormat;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        
        double total = 1.0;
        
        for (int i = 2; i <= 100; i++) {
        	total += 1 / (double)i;
        }
        
       	System.out.println(df.format(total).replaceAll(",", "."));

    }
}