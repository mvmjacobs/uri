import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         
        int n = Integer.parseInt(input.readLine());
        
        int f = 1;
        for (int i = 1; i <= n; i++) {
        	f *= i;
        }
        
        System.out.println(f);

    }
}