import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); 
        int matriz[][] = new int[100][100];
         
        func(br, matriz); 
    }
     
     static void func(BufferedReader br, int matriz[][]) throws IOException{
        int tam = Integer.parseInt(br.readLine());
        int cont = 1;
        int ini = 0;
        int fim = tam - 1;
         
        for(int j = 0; j < (tam+1) / 2; j++){
            for(int i = ini; i <= fim; i++){
                matriz[i][ini] = cont;
                matriz[ini][i] = cont;
                matriz[i][fim] = cont;
                matriz[fim][i] = cont;
            }
            cont++;
            ini++;
            fim--;
        }
         
        if(tam != 0){
            for(int i = 0; i < tam; i++)
                for(int j = 0; j < tam; j++)
                    if ( j == tam - 1 )    
                        System.out.printf("%3d\n", matriz[i][j]);
                    else
                        System.out.printf("%3d ", matriz[i][j]);
             
            System.out.printf("\n");
             
            func(br,matriz);
        }
    }
}