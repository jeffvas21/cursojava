import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N=0, pum = 1;

        N = teclado.nextInt();
        for(int cont=1;cont <= N;cont++) {

            System.out.println(pum +" "+ (pum+1) +" " + (pum+2) + " PUM");
            pum=pum +4;
        }
    }
}