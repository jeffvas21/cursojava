import java.util.Scanner;
public class Uri1006{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, C, Media;

        // Entrada - ler os valores de A, B e C
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        // processamento, medias A peso 2 / B peso 3 / C peso 5
        Media = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10f ;

        //Saida, exibir o valor de MEDIA
        System.out.print("MEDIA = ");
        System.out.printf("%.1f%n", Media);
    }
}