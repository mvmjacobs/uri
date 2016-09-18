import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String diaInicio = input.nextLine();
        String horaInicio = input.nextLine();
        String diaFim = input.nextLine();
        String horaFim = input.nextLine();
        
        int d = 0;
        int h = 0;
        int m = 0;
        int s = 0;
        
		int di = Integer.parseInt(diaInicio.substring(4));
		int hi = Integer.parseInt(horaInicio.substring(0, 2));
		int mi = Integer.parseInt(horaInicio.substring(5, 7));
		int si = Integer.parseInt(horaInicio.substring(10));
		
		int df = Integer.parseInt(diaFim.substring(4));
		int hf = Integer.parseInt(horaFim.substring(0, 2));
		int mf = Integer.parseInt(horaFim.substring(5, 7));
		int sf = Integer.parseInt(horaFim.substring(10));

		if (sf < si) {
			s = 60 - (si - sf);
			m--;
		} else {
			s = sf - si;
		}
		
		if (mf < mi) {
			m += 60 - (mi - mf);
			h--;
		} else {
			m += mf - mi;
		}
		
		if (hf < hi) {
			h += 24 - (hi - hf);
			d--;
		} else {
			h = hf - hi;
		}
		
		d += df - di;
			
        System.out.println(d + " dia(s)");
        System.out.println(h + " hora(s)");
        System.out.println(m + " minuto(s)");
        System.out.println(s + " segundo(s)");        
   	}
}
