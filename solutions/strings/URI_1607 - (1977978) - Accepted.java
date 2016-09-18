import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
        	String s = br.readLine();
        	System.out.println(calcula(s));
        }
    }
    
    static int calcula(String str) {
    	String s[] = str.split(" ");
    	int t = 0;
    	if (s[0].length() == s[1].length()) {
    		for (int i = 0; i < s[0].length(); i++) {
    			int a = (int)s[0].charAt(i);
    			int b = (int)s[1].charAt(i);
				if (a > b) {
    				t += (26 - (a - b));
    			} else if (a < b) {
    				t += (b - a);
    			}
    		}
    	}
    	return t;
    }
}