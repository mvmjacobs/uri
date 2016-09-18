import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		do{
        	String s = br.readLine();
        	System.out.println(rot(s));
		} while (br.ready());
    }
    
    static String rot(String s) {
    	String aux = "";
    	int ini = 0, fim = 0;
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
    			ini = (int)'A';
    			fim = (int)'Z';
    		} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
    			ini = (int)'a';
    			fim = (int)'z';
    		} else {
    			aux += s.charAt(i);
    			continue;
    		}
    		if (((int)s.charAt(i) + 13) > fim) {
    			aux += (char)(ini + (13 - (fim - (int)s.charAt(i))) - 1);
    		} else {
    			aux += (char)((int)s.charAt(i) + 13);
    		}
    	}
    	return aux;
    }
}