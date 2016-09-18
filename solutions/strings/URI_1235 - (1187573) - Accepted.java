import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String vet[] = new String[n];
        String vetor[] = new String[n];
        for (int i = 0; i < n; i++) {
        	vet[i] = input.readLine();
	        String aux1 = "";
	        String aux2 = "";
	        for (int j = vet[i].length()/2-1; j >= 0; j--) {
	        	aux1 += vet[i].substring(0, (vet[i].length()/2)).charAt(j);
	        	aux2 += vet[i].substring(vet[i].length()/2).charAt(j);
	        }
	        vetor[i] = aux1 + aux2;
        }
        
        for (int i = 0; i < n; i++) {
	        System.out.println(vetor[i]);
        }

   	}
}
