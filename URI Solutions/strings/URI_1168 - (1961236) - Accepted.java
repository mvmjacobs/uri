import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        
        int v[] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
        	String s = br.readLine();
        	int t = 0;
        	for (int j = 0; j < s.length(); j++) {
        		t += v[((j == s.length() - 1) ? Integer.parseInt(s.substring(j)) : Integer.parseInt(s.substring(j, j+1)))];
        	}
        	System.out.println(t + " leds");
        }
    }
}