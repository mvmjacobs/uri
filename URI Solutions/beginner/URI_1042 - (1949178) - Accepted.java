import java.io.*;
    
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
         
        String str = br.readLine();
        String v[] = str.split(" ");
        String aux = "";
        for (int i = 0; i < v.length; i++) {
        	for (int j = i; j < v.length; j++) {
        		if (Integer.parseInt(v[i]) > Integer.parseInt(v[j])) {
	        		aux = v[i];
	        		v[i] = v[j];
	        		v[j] = aux;
        		}
        	}        	
        	System.out.println(v[i]);
        }
        System.out.println("\n" + str.replaceAll(" ", "\n"));
    }
}