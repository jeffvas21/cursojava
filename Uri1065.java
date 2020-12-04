import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor = 0; 
        int pares = 0;
        int contador;
    for(contador=1;contador <= 5;contador++) {
        valor = teclado.nextFloat();

        if (( valor % 2.0) == 0){
            pares++;
        }
    }
    System.out.println(pares + " valores pares");
    }
}