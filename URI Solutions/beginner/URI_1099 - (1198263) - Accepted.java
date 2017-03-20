import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(input.readLine());
    	for (int i = 0; i < n; i++) {
  			int aux = 0;
    		String s = input.readLine();
    		int a = Integer.parseInt(s.substring(0, s.indexOf(" ")));
    		int b = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
    		int ma = a >= b ? a : b;
    		int me = a >= b ? b : a;
    		for (int j = me + 1; j < ma; j++) {
    			if (j % 2 != 0) {
    				aux += j;
    			}
    		}
    		System.out.println(aux);
    	}

  	}
}
