import java.io.*;
import java.text.DecimalFormat;
import java.lang.Math;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.0");
        String sdf = "";
         
        String entrada = input.readLine();
        String valor[] = entrada.split(" ");
        double n1 = Double.parseDouble(valor[0]);
        double n2 = Double.parseDouble(valor[1]);
        double n3 = Double.parseDouble(valor[2]);
        double n4 = Double.parseDouble(valor[3]);
        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        double exame = 0.0;
        if ((media >= 5.0) && (media < 7.0)) {
	        exame = Double.parseDouble(input.readLine());        	
        }
        sdf = df.format(media);
        System.out.println("Media: " + sdf.replaceAll(",", "."));
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if ((media >= 5.0) && (media < 7.0)) {
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: " + exame);
            double mf = (exame + media) / 2;
            if (mf >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (media < 5.0) {
                System.out.println("Aluno reprovado.");
            }
            sdf = df.format(mf);
            System.out.println("Media final: " + sdf.replaceAll(",", "."));
        }
                 
    }
}