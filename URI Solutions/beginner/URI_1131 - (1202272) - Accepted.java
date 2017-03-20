import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    	
		int flag = 0;
		int vg = 0, vi = 0, em = 0, total = 0;
		while (flag <= 2) {
    		String s = input.readLine();
    		int gi = Integer.parseInt(s.substring(0, s.indexOf(" ")));
    		int gg = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
    		total++;
    		if (gg > gi) {
    			vg++;
    		} else if (gg < gi) {
    			vi++;
    		} else {
    			em++;
    		}
    		flag = 2;
    		if (flag == 2) {
    			flag = 0;
	    		while (flag < 1 || flag > 2) {
	    			System.out.println("Novo grenal (1-sim 2-nao)");
	    			flag = Integer.parseInt(input.readLine());
	    			if (flag == 2) {
	    				flag = 40;
	    				break;
	    			}
	    		}
	    		if (flag != 40) {
		    		flag = 0;
	    		}
    		}
		}
		System.out.println(total + " grenais");
		System.out.println("Inter:" + vi);
		System.out.println("Gremio:" + vg);
		System.out.println("Empates:" + em);
		System.out.println((vi > vg ? "Inter" : "Gremio") + " venceu mais");
  	}
}
