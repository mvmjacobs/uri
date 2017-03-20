import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(input.readLine());
        
        for (int i = 0; i < n; i++) {
        	String str = input.readLine();
        	String s[] = str.split(" ");
        	int j = 0, x = 0, soma = 0;
        	while (j < Integer.parseInt(s[1])){
        		if (((Integer.parseInt(s[0]) + x) % 2) != 0) {
        			soma += Integer.parseInt(s[0]) + x;
        			j++;
        		}
        		x++;
        	}
        	System.out.println(soma);        	
        }
    }
}