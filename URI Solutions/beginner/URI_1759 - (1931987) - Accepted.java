import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(input.readLine());
		for (int i = 1; i < n; i++) {
			System.out.print("Ho ");
		}
		System.out.println(n > 0 ? "Ho!" : "");
    }
}