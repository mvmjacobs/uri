import java.io.*;
import java.lang.Math;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
		
        for (int i = 0; i < n; i++) {
        	int s = 0;
        	int x = Integer.parseInt(input.readLine());
        	for (int j = 1; j < x; j++) {
        		if (x % j == 0) {
        			s += j;
        		}
        	}
        	System.out.println(x + (s == x ? " eh perfeito" : " nao eh perfeito"));
        }
    }
}