import java.io.*;
import java.lang.Math;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
		
        for (int i = 0; i < n; i++) {
        	String str = input.readLine();
        	String s[] = str.split(" ");
        	double ta = 1 + (Double.parseDouble(s[2]) / 100);
        	double tb = 1 + (Double.parseDouble(s[3]) / 100);
        	double pa = Math.floor(Double.parseDouble(s[0]) * ta);
        	double pb = Math.floor(Double.parseDouble(s[1]) * tb);
        	
        	int a = 1;
       		while (pb >= pa && a <= 100) {
        		pa = Math.floor(pa * ta);
        		pb = Math.floor(pb * tb);
        		a++;
        	}
        	
        	System.out.println(a > 100 ? "Mais de 1 seculo." : (a + " anos."));
        	
        }
    }
}