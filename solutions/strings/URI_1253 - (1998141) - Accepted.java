import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
        	String s = br.readLine();
        	int x = Integer.parseInt(br.readLine());
        	System.out.println(cifra(s, x));
		}
    }
    
    static String cifra(String s, int n) {
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
    		if (((int)s.charAt(i) - n) < ini) {
    			aux += (char)(fim - (n + (ini - (int)s.charAt(i))) + 1);
    		} else {
    			aux += (char)((int)s.charAt(i) - n);
    		}
    	}
    	return aux;
    }
}