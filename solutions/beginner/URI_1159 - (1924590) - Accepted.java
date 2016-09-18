import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(input.readLine());
        while (n != 0) {
        	int i = 0, j = 0, soma =0;
        	while (i < 5){
        		if (((n + j) % 2) == 0) {
        			soma += n + j;
        			i++;
        		}
        		j++;
        	}
        	System.out.println(soma);
	        n = Integer.parseInt(input.readLine());    	
        }
    }
}