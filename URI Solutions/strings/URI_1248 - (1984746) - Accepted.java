import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
        	String s = br.readLine();
        	String c = br.readLine();
        	String a = br.readLine();
        	System.out.println(enc(s, (c + a)));
		}
    }
    
    static String ordena(String str) {
    	str = str.toUpperCase();
    	String s[] = str.split(" ");
    	String aux = "";
    	for (int i = 0; i < s.length; i++) {
    		for (int j = i; j < s.length; j++) {
    			if (s[i].charAt(0) > s[j].charAt(0)) {
    				String q = s[i];
    				s[i] = s[j];
    				s[j] = q;
    			}
    		}
    		aux += s[i];
    	}
    	return aux;
    }
    
    static String enc(String d, String c) {
    	String aux = "", s = "";
    	int cont = 0;
    	for (int i = 0; i < d.length(); i++) {
    		cont = 0;
    		for (int j = 0; j < c.length(); j++) {
    			if (d.charAt(i) == c.charAt(j)) {
    				cont++;
    			}
    		}
    		if (cont == 0) {
    			aux += d.charAt(i) + " ";
    		} else if (cont > 1) {
    			return "CHEATER";
    		} else if (cont == 1) {
    			s += d.charAt(i);
    		}
    	}
    	return (s.length() == c.length() ? (aux.length() == 0 ? "" : ordena(aux)) : "CHEATER");
    }
}