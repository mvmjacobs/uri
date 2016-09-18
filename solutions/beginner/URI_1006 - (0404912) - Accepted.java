import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.0");
				
		double A, B, C, MEDIA, X;
		String AUX, AUX1;
		
		A = Double.parseDouble(input.readLine());
		B = Double.parseDouble(input.readLine());
		C = Double.parseDouble(input.readLine());
		MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;
		AUX = df.format(MEDIA);
		AUX = AUX.replaceAll(",", ".");
		MEDIA = Double.parseDouble(AUX);
		
		System.out.println("MEDIA = " + MEDIA);
    }
}