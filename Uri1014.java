import java.util.Scanner;
public class Uri1014{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        double X;
        double Y, Consumo;
                
        // Entradas
        X = teclado.nextDouble();
        Y = teclado.nextDouble();
     
        // processamento,
        Consumo = (float)X / Y;

        //Saida, exibir o valor de X
        System.out.printf("%.3f km/l%n",Consumo);

    }
}