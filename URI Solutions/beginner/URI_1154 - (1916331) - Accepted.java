import java.io.*;
import java.text.DecimalFormat;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        
        int n = Integer.parseInt(input.readLine());
        int i = 0;
        double total = 0.0;
        while (n >= 0) {
        	i++;
        	total += n;
        	n = Integer.parseInt(input.readLine());
        }
        
        if (i > 0)
        	System.out.println(df.format(total / i).replaceAll(",", "."));

    }
}