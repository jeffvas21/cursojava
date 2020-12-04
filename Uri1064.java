import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double valor = 0;
        int qtdepositivo=0;
        double total =0 , media = 0;
        int entrada;

        for(entrada=1; entrada <= 6; entrada++){
            valor = teclado.nextDouble();

            if (valor>0){
                qtdepositivo++;
                total = total + valor;
            }
        }
        media = total / qtdepositivo;
        System.out.println(qtdepositivo + " valores positivos");
        System.out.printf("%.1f%n", media);
    }
}