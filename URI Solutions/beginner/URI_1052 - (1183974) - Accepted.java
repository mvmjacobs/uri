import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String sdf;
        int valor = input.nextInt();

		String mes[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		System.out.println(mes[valor-1]);

   	}
}
