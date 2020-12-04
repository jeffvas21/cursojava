import java.util.Scanner;
public class Uri1003{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, SOMA;

        // Entrada - ler os valores de A e B
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processamento, somar os valores de A e B
        SOMA = A + B;

        //Saida, exibir o valor de SOMA
        System.out.println("SOMA = " + SOMA);
    }
}
