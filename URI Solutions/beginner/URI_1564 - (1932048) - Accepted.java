import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		do {
			n = Integer.parseInt(input.readLine());
			if (n == 0) {
				System.out.println("vai ter copa!");
			} else if (n > 0 && n <= 100){
				System.out.println("vai ter duas!");
			} else {
				break;
			}
		} while (input.ready());
    }
}