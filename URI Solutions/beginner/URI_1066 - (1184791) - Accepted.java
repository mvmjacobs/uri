import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int valor;
        int par = 0;
        int impar = 0;
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < 5; i++) {
            valor = input.nextInt();
            if (valor % 2 == 0) {
                par++;
            } else {
            	impar++;
            }
            if (valor > 0) {
            	pos++;
            } else if (valor < 0) {
            	neg++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
   	}
}
