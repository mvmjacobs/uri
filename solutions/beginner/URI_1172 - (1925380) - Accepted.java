import java.io.*;
import java.lang.Math;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int v[] = new int[10];
        for (int i = 0; i < 10; i++) {
        	int n = Integer.parseInt(input.readLine());
        	v[i] = n <= 0 ? 1 : n;
        	System.out.println("X[" + i + "] = " + v[i]);
        }
    }
}