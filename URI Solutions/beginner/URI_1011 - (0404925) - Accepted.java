import java.io.*;
import java.text.DecimalFormat;
import java.lang.Math;
  
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("0.000");
                  
        double volume, pi, R;
        String AUX;
 
          
        R = Double.parseDouble(input.readLine());
        pi = 3.14159;
        volume = (4 * pi * (Math.pow(R, 3))) / 3;
        AUX = df.format(volume);
        AUX = AUX.replaceAll(",", ".");
          
        System.out.println("VOLUME = " + AUX);
    }
}