import java.io.*;
import java.text.DecimalFormat;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.000");
		String sdf;
		
		int n = Integer.parseInt(input.readLine());
		int horas = 0, minutos = 0, min = 0, seg = 0;
		
		seg = n % 60;
		minutos = n / 60;
		min = minutos % 60;
		horas = minutos / 60;
		
		System.out.println(horas + ":" + min + ":" + seg);
	}
}