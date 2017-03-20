import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int par[] = new int[5];
		int impar[] = new int[5];
		
		int p = 0, im = 0;
		for (int i = 0; i < 15; i++) {
			int n = Integer.parseInt(input.readLine());
			if (n % 2 == 0) {
				if (p >= par.length) {
					for (int j = 0; j < par.length; j++) {
	       				System.out.println("par[" + j + "] = " + par[j]);
	       				par[j] = 0;
					}
					p = 0;
				}
				par[p] = n;
				p++;
			} else {
				if (im >= impar.length) {
					for (int j = 0; j < impar.length; j++) {
	       				System.out.println("impar[" + j + "] = " + impar[j]);
	       				impar[j] = 0;
					}
					im = 0;
				}
				impar[im] = n;
				im++;
			}
		}
		
		for (int i = 0; i < impar.length && impar[i] != 0; i++) {
	       	System.out.println("impar[" + i + "] = " + impar[i]);
		}

		for (int i = 0; i < par.length && par[i] != 0; i++) {
	       	System.out.println("par[" + i + "] = " + par[i]);
		}
		
    }
}