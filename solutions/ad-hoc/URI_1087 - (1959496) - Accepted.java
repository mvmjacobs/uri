import java.io.*;
import java.lang.Math;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        do {
	        String str = br.readLine();
	        String v[] = str.split(" ");
	        int x1 = Integer.parseInt(v[0]);
	        int y1 = Integer.parseInt(v[1]);
	        int x2 = Integer.parseInt(v[2]);
	        int y2 = Integer.parseInt(v[3]);
	        if ((x1 == 0) && (y1 == 0) && (x2 == 0) && (y2 == 0)) {
	        	break;
	        }
	        if ((x1 == x2) && (y1 == y2)) {
	        	System.out.println(0);
	        } else if ((x1 == x2) || (y1 == y2)) {
	        	System.out.println(1);
	        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
	        	System.out.println(1);	        	
	        } else {
	        	System.out.println(2);
	        }
        } while (true);
    }
}