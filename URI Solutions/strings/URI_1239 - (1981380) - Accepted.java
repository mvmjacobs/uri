import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		do {
        	String s = br.readLine();
        	System.out.println(atalhos(s));
		} while (br.ready());
    }
    
    static String atalhos(String s) {
    	boolean isClosedI = true;
    	boolean isClosedB = true;
    	String aux = "";
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == '_') {
    			if (isClosedI) {
    				aux += "<i>";
    				isClosedI = false;
    			} else {
    				aux += "</i>";    				
    				isClosedI = true;
    			}
    		} else if (s.charAt(i) == '*') {
    			if (isClosedB) {
    				aux += "<b>";
    				isClosedB = false;
    			} else {
    				aux += "</b>";    				
    				isClosedB = true;
    			}
    		} else {
    			aux += s.charAt(i);
    		}
    	}
    	return aux;
    }
}