import java.util.Scanner;
public class Uri1010{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int COD1, NRO1, COD2, NRO2;
        double VLR1, VLR2, TOTAL;

        // Entrada - ler os valores de A e B
        COD1 = teclado.nextInt();
        NRO1 = teclado.nextInt();
        VLR1 = teclado.nextDouble();
        COD2 = teclado.nextInt();
        NRO2 = teclado.nextInt();
        VLR2 = teclado.nextDouble();
        
        // processamento, somar os valores de A e B
        TOTAL = ((NRO1 * VLR1)+(NRO2 * VLR2));

        //Saida, exibir o valor de X
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",TOTAL); 
    }
}
