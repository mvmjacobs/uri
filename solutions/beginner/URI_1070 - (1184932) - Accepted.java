import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        for (int i = valor, j = 1; j <= 6; i++) {
            if (i % 2 != 0) {
            	System.out.println(i);
            	j++;
            }
        }
   	}
}
