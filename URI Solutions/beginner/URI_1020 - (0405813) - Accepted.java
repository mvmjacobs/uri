import java.io.*;
import java.text.DecimalFormat;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.000");
		String sdf;
		
		int n = Integer.parseInt(input.readLine());
		int anos = 0, meses = 0, mes = 0, dias = 0;
		
		anos = n / 365;
		meses = n % 365;
		mes = meses / 30;
		dias = meses % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dias + " dia(s)");
	}
}