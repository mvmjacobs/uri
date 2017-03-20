import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        for (int i = 1; i <= valor; i++) {
            if (i % 2 != 0) {
            	System.out.println(i);
            }
        }
   	}
}
