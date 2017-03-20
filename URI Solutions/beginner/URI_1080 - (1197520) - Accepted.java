import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(input.readLine());
		int maior = n;
		int pos = 1;
        for (int i = 2; i <= 100; i++) {
        	n = Integer.parseInt(input.readLine());
			if (n > maior) {
				maior = n;
				pos = i;
			}
        }
        System.out.println(maior);
        System.out.println(pos);
   	}
}
