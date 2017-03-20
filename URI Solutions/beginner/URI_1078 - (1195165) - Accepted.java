import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        for (int i = 1; i <= 10; i++) {
        	System.out.println(i + " x " + n + " = " + (i*n));
        }        
   	}
}
