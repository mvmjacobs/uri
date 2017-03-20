import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");
		int n[] = { 61, 71, 11, 21, 32, 19, 27, 31 };
		String city[] = { "Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte" };

		int ddd = input.nextInt();
		for (int i = 0; i < n.length; i++) {
			if (ddd == n[i]) {
				System.out.println(city[i]);
				break;
			} else {
				if (i >= 7) {
					System.out.println("DDD nao cadastrado");
				}
			}
		}

		
   	}
}
