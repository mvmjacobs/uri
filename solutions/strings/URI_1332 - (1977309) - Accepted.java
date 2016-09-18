import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        
        String v[] = {"one", "two", "three"};
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
        	String s = br.readLine();
        	System.out.println(verifica(s, v));
        }
    }
    
    static int verifica(String s, String v[]) {
    	if (s.length() == 5) {
    		return 3;
    	}
    	int c = 0;
    	for (int i = 0; i < v.length - 1; i++) {
    		if (v[i].length() != s.length()) {
    			continue;
    		}
    		for (int j = 0; j < s.length(); j++) {
    			String a = ((j == (s.length() - 1 )) ? v[i].substring(j) : v[i].substring(j, j + 1));
    			String b = ((j == (s.length() - 1 )) ? s.substring(j) : s.substring(j, j + 1));
    			if (!(a.equalsIgnoreCase(b))) {
    				c++;
    			}
    			if (c > 1) {
    				return i == 0 ? 2 : 1;
    			}
    		}
    	}
    	return 0;
    }
}