import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int valor;
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            valor = input.nextInt();
            if (valor % 2 == 0) {
                cont++;
            }
        }

        System.out.println(cont + " valores pares");
   	}
}
