import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
        	String s = br.readLine();
        	System.out.println(criptografia(s));
        }
    }
    
    static String criptografia(String str) {
    	String s = str;
    	s = first(s);
    	s = second(s);
    	s = third(s);
    	return s;
    }
    
    static String first(String s) {
    	String aux = "";
    	for (int i = 0; i < s.length(); i++) {
    		if (((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) || ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))) {
    			aux += (char)(s.charAt(i) + 3);
    		} else {
    			aux += (char)s.charAt(i);
    		}
    	}    	
    	return aux;
    }

    static String second(String s) {
    	String aux = "";
    	for (int i = s.length() - 1; i >= 0; i--) {
    		aux += (char)s.charAt(i);
    	}
    	return aux;
    }

    static String third(String s) {
    	String aux = s.substring(0, (s.length() / 2));
    	for (int i = aux.length(); i < s.length(); i++) {
    		aux += (char)(s.charAt(i) - 1);
    	}
    	return aux;
    }
}