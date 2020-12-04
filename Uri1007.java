import java.util.Scanner;
public class Uri1007{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D, Diferenca;

        // Entrada - ler os valores de A, B, C, D
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        // processamento, calcula diferença entre os valores
        Diferenca = (A * B - C * D);

        //Saida, exibir o valor de SOMA
        System.out.println("DIFERENCA = " + Diferenca);
    }
}
