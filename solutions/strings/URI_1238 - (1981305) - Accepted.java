import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
        	String s = br.readLine();
        	System.out.println(combinador(s));
		}
    }
    
    static String combinador(String str) {
    	String s[] = str.split(" ");
    	String aux = "";
    	int i = 0;
    	for (i = 0; i < s[0].length() && i < s[1].length(); i++) {
    		String a = s[0].charAt(i) + "";
    		String b = s[1].charAt(i) + "";
    		aux += a + b;
    	}
    	aux += s[0].length() > s[1].length() ? s[0].substring(i) : s[1].substring(i);
    	return aux;
    }
}