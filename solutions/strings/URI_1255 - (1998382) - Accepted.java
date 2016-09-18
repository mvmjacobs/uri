import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
        	String s = br.readLine();
        	freq(s);
        	System.out.println("");
		}
    }
    
    static void freq(String s) {
    	s = s.toLowerCase();
    	int v[] = new int[26];
    	int c = 0, maior = 1;
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
	    		c = (int)s.charAt(i) - (int)'a';
	    		if (v[c] != 0) {
	    			continue;
	    		}
	    		for (int j = 0; j < s.length(); j++) {
	    			if (s.charAt(i) == s.charAt(j)) {
	    				v[c]++;
	    			}
	    		}
	    		if (v[c] > maior) {
	    			maior = v[c];
	    		}
    		}
    	}
    	for (int i = 0; i < v.length; i++) {
    		if (v[i] == maior) {
    			System.out.print((char)(i + (int)'a'));
    		}
    	}
    }
}