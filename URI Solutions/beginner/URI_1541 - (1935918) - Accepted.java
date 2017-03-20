import java.io.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int n = 1;
		while (n != 0) {
			String str = input.readLine();
			String s[] = str.split(" ");
			if (s.length == 1) {
				n = Integer.parseInt(s[0]);
				continue;
			}
			
			double t = (((Integer.parseInt(s[0]) * Integer.parseInt(s[1])) * 100) / Integer.parseInt(s[2])); 
			t = Math.sqrt(t);
			System.out.println((int)t);
		}
    }
}