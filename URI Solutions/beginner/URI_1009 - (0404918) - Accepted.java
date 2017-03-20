import java.io.*;
import java.text.DecimalFormat;
 
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.00");
                 
        double salario, vendas;
   		String AUX, nome;

        nome = input.readLine();
        salario = Double.parseDouble(input.readLine());
        vendas = Double.parseDouble(input.readLine());
        
        salario = salario + (vendas * 0.15);
        AUX = df.format(salario);
        AUX = AUX.replaceAll(",", ".");
         
        System.out.println("TOTAL = R$ " + AUX);

    }
}