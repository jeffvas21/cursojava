import java.util.Scanner;
public class Uri1001{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, X;

        // Entrada - ler os valores de A e B
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processamento, somar os valores de A e B
        X = A + B;

        //Saida, exibir o valor de X
        System.out.println("X = " + X);
    }
}
