import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n >= 1 && n <= 10000) {
	        for (int i = 1; i <= n; i++) {
	        	int v = Integer.parseInt(br.readLine());
	        	System.out.println("Caso #" + i + ": " + krapekar(v));
	        }
        }
    }
    
    static String geraString(int x) {
    	String s = x + "";
    	for (int i = 1; i <= (4 - Integer.toString(x).length()); i++) {
    		s += "0";
    	}
    	return s;
    }
    
    static int geraValor(int x, String t) {
    	//String s[] = geraString(x).split("");
    	String str = geraString(x);
    	String s[] = new String[4];
    	for (int i = 0; i < str.length(); i++) {
    		if (i == str.length() - 1) {
    			s[i] = str.substring(i);
    		} else {
    			s[i] = str.substring(i, i+1);
    		}
    	}
    	String aux = "";
    	str = "";
    	for (int i = 0; i < s.length; i++) {
    		for (int j = i; j < s.length; j++) {
    			if (Integer.parseInt(s[i]) > Integer.parseInt(s[j])) {
    				aux = s[i];
    				s[i] = s[j];
    				s[j] = aux;
    			}
    		}
    		str += s[i];
    	}
    	if (t.equalsIgnoreCase("maior")) {
    		str = "";
		    for (int i = s.length - 1; i >= 0; i--) {
		    	str += s[i];
		    }
    	}
		return Integer.parseInt(str);
    }
        
    static int krapekar(int x) {
    	int cont = 0;
    	while (x != 6174) {
    		if (x == 0) {
    			return -1;
    		}
    		x = geraValor(x, "maior") - geraValor(x, "menor");
    		cont++;
    	}
    	return cont;
    }
}