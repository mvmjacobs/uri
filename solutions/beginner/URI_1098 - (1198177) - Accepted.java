import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) {
        DecimalFormat df = new DecimalFormat("0.0");
        DecimalFormat df1 = new DecimalFormat("0");
		double i = 0.0;
		while (i <= 2) {
			for (int j = 1; j <= 3; j++) {
				if (i == 0 || i == 1 || i >= 1.99999) {
					System.out.println("I=" + df1.format(i).replace(",", ".") + " J=" + df1.format(i + j).replace(",", "."));
				} else {
					System.out.println("I=" + df.format(i).replace(",", ".") + " J=" + df.format(i + j).replace(",", "."));					
				}
			}
			i += 0.2;
		}
  	}
}
