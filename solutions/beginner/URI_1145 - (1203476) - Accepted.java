import java.io.*;
 
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         
    	String s = input.readLine();
    	int a = Integer.parseInt(s.substring(0, s.indexOf(" ")));
    	int b = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
        int x = 1;
        int y = a;
        for (int i = 0; i < b/a; i++) {
            for (int j = x; j <= y; j++) {
                System.out.print(j + (j == y ? "" : " "));
            }
	        System.out.println("");
            x += a;
            y += a;
        }
 
    }
}