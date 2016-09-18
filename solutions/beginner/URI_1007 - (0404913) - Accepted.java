import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
				
		int A, B, C, D, DIFERENCA;
		
		A = Integer.parseInt(input.readLine());
		B = Integer.parseInt(input.readLine());
		C = Integer.parseInt(input.readLine());
		D = Integer.parseInt(input.readLine());
		DIFERENCA = (A * B) - (C * D);
		
		System.out.println("DIFERENCA = " + DIFERENCA);
    }
}