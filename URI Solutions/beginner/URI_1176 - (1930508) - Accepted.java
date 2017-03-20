import java.io.*;
   
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
 
        long v[] = new long[61];
        v[0] = 0;
        v[1] = 1;
        for (int i = 2; i < v.length; i++) {
        	v[i] = v[i-1] + v[i-2];
        }
        
        int n = Integer.parseInt(input.readLine());
        for (int i = 1; i <= n; i++) {
            int x = Integer.parseInt(input.readLine());
            System.out.println("Fib(" + x + ") = " + v[x]);
        }
    }
}