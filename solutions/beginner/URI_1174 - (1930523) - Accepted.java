import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		double v[] = new double[100];
        for (int i = 0; i < v.length; i++) {
			double n = Double.parseDouble(input.readLine());
        	v[i] = n;
        }

		for (int i = 0; i < v.length; i++) {
			if (v[i] <= 10) {
	        	System.out.println("A[" + i + "] = " + v[i]);
			}
		}

    }
}