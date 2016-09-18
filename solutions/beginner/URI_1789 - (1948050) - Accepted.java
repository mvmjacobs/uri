import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		do {
			n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String s[] = str.split(" ");
			int m = 1, aux;
			for (int i = 0; i < s.length; i++) {
				int x = Integer.parseInt(s[i]);
				if (x < 10) {
					aux = 1;
				} else if (x < 20) {
					aux = 2;
				} else {
					aux = 3;
				}
				if (aux >= m) {
					m = aux;
				}
			}
			System.out.println(m);
		} while (br.ready());
    }
}