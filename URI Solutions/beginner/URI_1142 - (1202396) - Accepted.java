import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(input.readLine());
    	int x = 1;
    	int y = 3;
    	for (int i = 0; i < n; i++) {
    		for (int j = x; j <= y; j++) {
    			System.out.print(j + " ");
    		}
    		System.out.println("PUM");
    		x += 4;
    		y += 4;
    	}

  	}
}
