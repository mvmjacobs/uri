import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(input.readLine());
    	for (int i = 0; i < n; i++) {
    		String s = input.readLine();
    		int x = Integer.parseInt(s.substring(0, s.indexOf(" ")));
    		int y = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
    		if (y != 0) {
    			System.out.println((double)x / (double)y);
    		} else {
    			System.out.println("divisao impossivel");
    		}
    	}

  	}
}
