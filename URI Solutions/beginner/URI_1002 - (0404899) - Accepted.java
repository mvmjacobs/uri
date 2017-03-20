import java.lang.Math;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
				
		double area, pi, raio;
		
		raio = Double.parseDouble(input.readLine());
		pi = 3.14159;
		area = pi * (Math.pow(raio, 2));
    	
    	System.out.printf("A=%.4f\n", area);
    }
}