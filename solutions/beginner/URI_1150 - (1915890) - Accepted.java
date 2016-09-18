import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         
        int x = Integer.parseInt(input.readLine());
        int z;
        do {
        	z = Integer.parseInt(input.readLine());
        } while (z <= x);
        
        int total = 0, i = x;
        do {
        	total += i;
        	i++;
        } while (total <= z);
        
   		System.out.println(i - x);

    }
}