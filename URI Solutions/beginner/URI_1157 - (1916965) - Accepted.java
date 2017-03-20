import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(input.readLine());
        
        for (int i = 1; i <= n; i++) {
        	if (n % i == 0) {
        		System.out.println(i);
        	}
        }
    }
}