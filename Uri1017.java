import java.util.Scanner;
public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double tempo, dist, qtdelitros;

    tempo = teclado.nextDouble();
    dist  = teclado.nextDouble();

    qtdelitros = (dist * tempo) / 12.0;

    System.out.printf("%.3f%n",qtdelitros);

        }
}