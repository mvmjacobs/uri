import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        String sdf;
    	
		int n = Integer.parseInt(input.readLine());
		int i, c = 0, r = 0, s = 0;
        for (i = 0; i < n; i++) {
        	String str = input.readLine();
        	if (str.charAt(str.length()-1) == 'C') {
        		c += Integer.parseInt(str.substring(0, str.indexOf(" ")));
        	} else if (str.charAt(str.length()-1) == 'R') {
        		r += Integer.parseInt(str.substring(0, str.indexOf(" ")));
        	} else {
        		s += Integer.parseInt(str.substring(0, str.indexOf(" ")));
        	}
        }
        System.out.println("Total: " + (c + r + s) + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);
        sdf = df.format(((double)(c * 100) / (double)(c + r + s)));
        System.out.println("Percentual de coelhos: " + sdf.replace(",", ".") + " %");
        sdf = df.format(((double)(r * 100) / (double)(c + r + s)));
        System.out.println("Percentual de ratos: " + sdf.replace(",", ".") + " %");
        sdf = df.format(((double)(s * 100) / (double)(c + r + s)));
        System.out.println("Percentual de sapos: " + sdf.replace(",", ".") + " %");
   	}
}
