import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    	
    	int flag = 0;
    	while (flag != -1) {
    		String s = input.readLine();
    		int x = Integer.parseInt(s.substring(0, s.indexOf(" ")));
    		int y = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
    		if (x == 0 || y == 0) {
    			flag = -1;
    			break;
    		}
    		if (x > 0 && y > 0) {
    			System.out.println("primeiro");
    		} else if (x < 0 && y > 0) {
    			System.out.println("segundo");
    		} else if (x < 0 && y < 0) {
    			System.out.println("terceiro");
    		} else {
    			System.out.println("quarto");
    		}
    	}

  	}
}
