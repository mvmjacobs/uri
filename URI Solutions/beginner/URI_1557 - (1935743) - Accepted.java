import java.io.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(input.readLine());
		while (n != 0) {
	        int m[][] = new int[n][n];	        
	        m[0][0] = 1;	        
	        int d = Integer.toString(Integer.parseInt(Math.round(Math.pow(2, ((n - 1) * 2))) + "")).length();
			int i = 0, j = 0;
        	for (i = 0; i < m.length; i++) {
        		for (j = 0; j < m[i].length; j++) {
        			if (j != 0) {
        				m[i][j] = m[i][j - 1] * 2;
        			}
        		}
        		if (i < m.length - 1) {
        			m[i + 1][0] = m[i][0] * 2;
        		}
        	}	        
	    	for (i = 0; i < m.length; i++) {
	    		for (j = 0; j < m[i].length; j++) {
	    			if (j == m.length - 1) {
	    				System.out.printf("%" + d + "d\n", m[i][j]);
	    			} else {
	    				System.out.printf("%" + d + "d ", m[i][j]);
	    			}
	    		}
	    	}
	    	System.out.println("");
	        n = Integer.parseInt(input.readLine());
		}
    }
}