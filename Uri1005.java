import java.util.Scanner;
public class Uri1005{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, Media;

        // Entrada - ler os valores de A e B
        A = teclado.nextDouble();
        B = teclado.nextDouble();

        // processamento, medias A peso 3.5 / B peso 7.5
        Media = ((A * 3.5) + (B * 7.5)) / 11f ;

        //Saida, exibir o valor de MEDIA
        System.out.print("MEDIA = ");
        System.out.printf("%.5f%n", Media);
    }
}