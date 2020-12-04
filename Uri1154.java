import java.util.Scanner;
public class Uri1154{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n=0;
        double media=0, qtde=0, idade=0;
        do {
        n = teclado.nextInt();
            if (n >= 0){
                idade = idade + n;
                qtde++;
            }
        } while (n >= 0);
        media = idade / qtde;
        System.out.printf("%.2f%n",media);
    }
}