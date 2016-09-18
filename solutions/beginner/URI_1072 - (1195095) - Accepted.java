import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int x, in = 0, out = 0;
        for (int i = 0; i < n; i++) {
        	x = Integer.parseInt(input.readLine());
        	if (x >= 10 && x <= 20) {
        		in++;
        	} else {
        		out++;
        	}
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        
   	}
}
