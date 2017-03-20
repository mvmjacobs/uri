import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
        String novo, rj;
        double result[] = new double[2];
        int per = 0;
        
        Double valor = input.nextDouble();
        
        if ((valor >= 0) && (valor <= 400.00)) {
			result[0] = ((valor * 0.15) + valor);
			result[1] = (valor * 0.15);
			per = 15;
        } else {
            if ((valor > 400.00) && (valor <= 800.00)) {
				result[0] = ((valor * 0.12) + valor);
				result[1] = (valor * 0.12);
				per = 12;
            } else {
                if ((valor > 800.00) && (valor <= 1200.00)) {
					result[0] = ((valor * 0.10) + valor);
					result[1] = (valor * 0.10);
					per = 10;
                } else {
                    if ((valor > 1200.00) && (valor <= 2000.00)) {
						result[0] = ((valor * 0.07) + valor);
						result[1] = (valor * 0.07);
						per = 7;
                    } else {
                        if (valor > 2000.00) {
							result[0] = ((valor * 0.04) + valor);
							result[1] = (valor * 0.04);
							per = 4;
                        }
                    }
                }
            }
        }
        novo = df.format(result[0]);
        rj = df.format(result[1]);
        
        System.out.println("Novo salario: " + novo.replaceAll(",", "."));
        System.out.println("Reajuste ganho: " + rj.replaceAll(",", "."));
        System.out.println("Em percentual: " + per + " %");
        

   	}
}
