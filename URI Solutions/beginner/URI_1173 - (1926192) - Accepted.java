import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int v[] = new int[10];
		int n = Integer.parseInt(input.readLine());
		v[0] = n;
        for (int i = 1; i < v.length; i++) {
        	v[i] = v[i-1] + v[i-1];
        }

		for (int i = 0; i < v.length; i++) {
        	System.out.println("N[" + i + "] = " + v[i]);
		}

    }
}