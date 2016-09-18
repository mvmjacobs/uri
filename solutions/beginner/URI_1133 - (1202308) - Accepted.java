import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(input.readLine());
		int y = Integer.parseInt(input.readLine());
		int me = (x < y ? x : y);
		int ma = (x < y ? y : x);
		for (int i = me + 1; i < ma; i++) {
			if ((i % 5 == 2) || (i % 5 == 3)) {
				System.out.println(i);
			}
		}
		
  	}
}
