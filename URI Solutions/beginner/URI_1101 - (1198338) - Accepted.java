import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    	
    	int soma = 0;
    	int flag = 0;
    	while (flag != -1) {
    		String s = input.readLine();
    		int a = Integer.parseInt(s.substring(0, s.indexOf(" ")));
    		int b = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
    		if (a <= 0 || b <= 0) {
    			flag = -1;
    			break;
    		}
    		int ma = a >= b ? a : b;
    		int me = a >= b ? b : a;
    		soma = 0;
    		for (int i = me; i <= ma; i++) {
    			System.out.print(i + " ");
    			soma += i;
    		}
    		System.out.println("Sum=" + soma);
    	}

  	}
}
