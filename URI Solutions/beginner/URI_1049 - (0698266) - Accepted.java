import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");
		
		String tipo1 = input.nextLine();
		String tipo2 = input.nextLine();
		String tipo3 = input.nextLine();
		
		if (tipo1.equals("vertebrado")) {
			if (tipo2.equals("ave")) {
				if (tipo3.equals("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (tipo3.equals("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (tipo2.equals("inseto")) {
				if (tipo3.equals("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (tipo3.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}
   	}
}
