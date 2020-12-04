import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = 0;
        int par=0, impar=0, positivo=0, negativo=0;
        int contador = 0;

        for (contador=1;contador <= 5;contador++) {
            valor = teclado.nextInt();
            if (valor > 0) {
                positivo++;
            }
            else if (valor < 0){
                negativo++;
            }
            if (valor%2 == 0){
                par++;
            }
            else {
                impar++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}