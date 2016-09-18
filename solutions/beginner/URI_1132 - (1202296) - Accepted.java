import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(input.readLine());
		int y = Integer.parseInt(input.readLine());
		int me = (x < y ? x : y);
		int ma = (x < y ? y : x);
		
		int soma = 0;
		for (int i = me; i <= ma; i++) {
			if (!(i % 13 == 0)) {
				soma += i;
			}
		}
		System.out.println(soma);
		
  	}
}
