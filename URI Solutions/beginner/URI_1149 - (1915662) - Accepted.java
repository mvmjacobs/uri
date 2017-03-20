import java.io.*;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         
        String s = input.readLine();
        String str[] = s.split(" ");
		int a = Integer.parseInt(str[0]);
		int n = 0;
		for (int i = 1; i < str.length; i++) {
			if (Integer.parseInt(str[i]) > 0) {
				n = Integer.parseInt(str[i]);
				break;
			}
		}
//		int n = Integer.parseInt(str[1]);
//	    while (n <= 0) {
//	        n = Integer.parseInt(input.readLine());
//        }
        int total = 0;
        for (int i = a; i < a + n; i++) {
            total += i;
        }
        System.out.println(total);
    }
}