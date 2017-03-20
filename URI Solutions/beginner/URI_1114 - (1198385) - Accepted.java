import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    	
    	int flag = 0;
    	while (flag != -1) {
    		String senha = "2002";
    		String s = input.readLine();
    		if (s.equals(senha)) {
    			flag = -1;
    			System.out.println("Acesso Permitido");
    			break;
    		} else {
    			System.out.println("Senha Invalida");
    		}
    	}

  	}
}
