import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		do {
        	String s = br.readLine();
        	System.out.println(sentenca(s));
        } while (br.ready());
    }
    
    static String sentenca(String s) {
    	String aux = "";
    	boolean t = true;
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) != ' ') {
	    		if (t) {
	    			aux += (s.charAt(i) + "").toUpperCase();
	    			t = false;
	    		} else {
	    			aux += (s.charAt(i) + "").toLowerCase();
	    			t = true;
	    		}
    		} else {
    			aux += s.charAt(i);
    		}
    	}
    	return aux;
    }
}