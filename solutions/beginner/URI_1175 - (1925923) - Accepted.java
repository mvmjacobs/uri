import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int v[] = new int[20];
        for (int i = 0; i < v.length; i++) {
        	int n = Integer.parseInt(input.readLine());
        	v[i] = n;
        }
		int aux = 0;
		for (int i = 0, j = v.length - 1; i < v.length / 2; i++, j--) {
			aux = v[j];
			v[j] = v[i];
			v[i] = aux;
		}
		
		for (int i = 0; i < v.length; i++) {
        	System.out.println("N[" + i + "] = " + v[i]);
		}

    }
}