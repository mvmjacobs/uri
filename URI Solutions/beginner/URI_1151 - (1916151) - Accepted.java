import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         
        int z;
        do {
        	z = Integer.parseInt(input.readLine());
        } while (z <= 0 || z >= 46);
        
        int i, f = 0, ant = 0;
        for (i = 0; i < z; i++) {
			if (i == 1) {
				f = 1;
				ant = 0;
			} else {
				f += ant;
				ant = f - ant;
			}
			System.out.print(f + ((i < z-1) ? " " : ""));
        }
        System.out.println("");


    }
}