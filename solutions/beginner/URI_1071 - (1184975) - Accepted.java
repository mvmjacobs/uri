import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int soma = 0;
        int ma = (x > y ? x : y);
        int me = (x < y ? x : y);
        for (int i = (me + 1); i < ma; i++) {
            if (i % 2 != 0) {
            	soma += i;
            }
        }
        System.out.println(soma);
   	}
}
