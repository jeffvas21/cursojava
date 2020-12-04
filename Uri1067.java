import java.util.Scanner;
public class Uri1067{
    public static void main(String agrs[]){
        Scanner teclado = new Scanner(System.in);
        int valor, contador=0;

        valor = teclado.nextInt();
        
        for(contador=1;(valor-contador)>=0;contador++){
                if ((contador %2 > 0) && (contador <= valor)){
                    System.out.println(contador);
                }
        }
    }
}
