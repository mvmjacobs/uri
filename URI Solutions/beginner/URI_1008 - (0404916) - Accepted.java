import java.io.*;
import java.text.DecimalFormat;
 
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.00");
                 
        int func, horas;
        double sal, salario;
   		String AUX;

        func = Integer.parseInt(input.readLine());
        horas = Integer.parseInt(input.readLine());
        sal = Double.parseDouble(input.readLine());
        
        salario = horas * sal;
        AUX = df.format(salario);
        AUX = AUX.replaceAll(",", ".");
         
        System.out.println("NUMBER = " + func);
        System.out.println("SALARY = U$ " + AUX);

    }
}