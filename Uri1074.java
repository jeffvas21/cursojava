import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N;
        int valor;

        N = teclado.nextInt();

        for(int cont=1;cont <= N; cont++){
            valor = teclado.nextInt();
            if ((valor % 2 == 0) && (valor > 0)){
                System.out.println("EVEN POSITIVE");
                }
            else if ((valor % 2 == 0) && (valor < 0)){
                System.out.println("EVEN NEGATIVE");
                }
            else if ((valor % 2 > 0) && (valor >= 0)){
                System.out.println("ODD POSITIVE");
                }
            else if ((valor % 2 < 0) && (valor < 0)){
                System.out.println("ODD NEGATIVE");
            }
            else if (valor ==0) {
                System.out.println("NULL");
            }

        }
    }
}

