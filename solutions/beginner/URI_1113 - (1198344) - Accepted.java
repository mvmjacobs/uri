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
    		if (a == b) {
    			flag = -1;
    			break;
    		}
    		System.out.println(a > b ? "Decrescente" : "Crescente");
    	}

  	}
}
