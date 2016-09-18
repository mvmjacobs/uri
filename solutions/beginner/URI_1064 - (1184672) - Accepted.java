import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        double valor;
        double media = 0;
        int cont = 0;
        for (int i = 0; i < 6; i++) {
            valor = input.nextDouble();
            if (valor > 0) {
            	media += valor;
                cont++;
            }
        }
        System.out.println(cont + " valores positivos");
        System.out.println(media/cont);
   	}
}
