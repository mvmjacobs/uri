import java.io.*;
import java.lang.Math;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
		
        for (int i = 0; i < n; i++) {
        	boolean p = true;
        	int x = Integer.parseInt(input.readLine());
        	for (int j = 2; j < x; j++) {
        		if (x % j == 0) {
        			p = false;
        			break;
        		}
        	}
        	System.out.println(x + (p ? " eh primo" : " nao eh primo"));
        }
    }
}