import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
        	String s = br.readLine();
        	System.out.println(enc(s));
		}
    }
    
    static String enc(String str) {
    	String s[] = str.split(" ");
    	boolean flag = true;
    	if (s[1].length() > s[0].length()) {
    		flag = false;
    	} else {
    		for (int i = s[0].length() - s[1].length(), j = 0; i < s[0].length(); i++, j++) {
    			if (s[0].charAt(i) != s[1].charAt(j)) {
    				flag = false;
    				break;
    			}
    		}
    	}
    	
    	return (flag ? "encaixa" : "nao encaixa");
    }
}