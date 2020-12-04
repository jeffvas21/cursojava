import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor, impar;

        valor=teclado.nextInt();
        if (valor%2 == 0){
           valor++;
        } 

        for(int contador=1;contador<=6;contador++){
            System.out.println(valor);
            valor+=2;
        }
    }
}