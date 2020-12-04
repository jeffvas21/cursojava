import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor, quadrado ;

        valor=teclado.nextInt();

        for(int contador =1;valor-contador>=0;contador++){
            if (contador%2 == 0){
                quadrado = contador * contador;
                System.out.println(contador+"^2 = "+quadrado);
            }
        }
    }
}