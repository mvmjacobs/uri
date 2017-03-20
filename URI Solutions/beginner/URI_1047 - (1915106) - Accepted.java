import java.util.Scanner;
import java.text.DecimalFormat;
 
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
         
        String entrada = input.nextLine();
        String time[] = entrada.split(" ");
        int hi = Integer.parseInt(time[0]);
        int mi = Integer.parseInt(time[1]);
        int hf = Integer.parseInt(time[2]);
        int mf = Integer.parseInt(time[3]);
        int dh = 0, dm = 0;
         
        if (hi == hf) {
            if (mi == mf) {
                System.out.println("O JOGO DUROU " + (24 - (hf - hi)) + " HORA(S) E " + (mf - mi) + " MINUTO(S)");
            } else {
                if (hf > hi) {
                    System.out.println("O JOGO DUROU " + (hf - hi) + " HORA(S) E " + (mf - mi) + " MINUTO(S)");
                }
            }
        } else {
            if (hi > hf) {
                dh = (24 - (hi - hf));
                if (mi == mf) {
                    System.out.println("O JOGO DUROU " + dh + " HORA(S) E " + (mf - mi) + " MINUTO(S)");
                } else {
                    if (mi > mf) {
                        dm = (60 - (mi - mf));
                        System.out.println("O JOGO DUROU " + (dh - 1) + " HORA(S) E " + dm + " MINUTO(S)");
                    } else {
                        if (mf > mi) {
                            dm = mf - mi;
                            System.out.println("O JOGO DUROU " + dh + " HORA(S) E " + dm + " MINUTO(S)");
                        }
                    }
                }
            } else {
                if (hf > hi) {
                    dh = hf - hi;
                    if (mi == mf) {
                        System.out.println("O JOGO DUROU " + dh + " HORA(S) E " + (mf - mi) + " MINUTO(S)");
                    } else {
                        if (mi > mf) {
                            dm = (60 - (mi - mf));
                            System.out.println("O JOGO DUROU " + (dh - 1) + " HORA(S) E " + dm + " MINUTO(S)");
                        } else {
                            if (mf > mi) {
                                dm = mf - mi;
                                System.out.println("O JOGO DUROU " + dh + " HORA(S) E " + dm + " MINUTO(S)");
                            }
                        }
                    }
                }
            }
        }
    }
}