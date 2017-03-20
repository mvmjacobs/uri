import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int x;
        for (int i = 1; i <= n; i++) {
        	x = Integer.parseInt(input.readLine());
        	if (x % 2 == 0) {
        		if (x > 0) {
        			System.out.println("EVEN POSITIVE");
        		} else if (x < 0) {
        			System.out.println("EVEN NEGATIVE");
        		} else {
        			System.out.println("NULL");
        		}
        	} else {
        		if (x > 0) {
        			System.out.println("ODD POSITIVE");
        		} else {
        			System.out.println("ODD NEGATIVE");
        		}
        	}

        }        
   	}
}
