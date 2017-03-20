import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
				
		int A, B, PROD;
		
		A = Integer.parseInt(input.readLine());
		B = Integer.parseInt(input.readLine());
		PROD = A * B;
    	
    	System.out.println("PROD = " + PROD);
    }
}