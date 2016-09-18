import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.00000");
				
		double A, B, MEDIA;
		
		A = Double.parseDouble(input.readLine());
		B = Double.parseDouble(input.readLine());
		MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
    	
    	System.out.println("MEDIA = " + df.format(MEDIA));
    }
}