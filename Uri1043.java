import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float A, B, C;
        int result;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        if (A+B > C && A+C > B && B+C > A){
            result = A + B + C;
            System.out.printf("Perimetro = %.1f%n",result);
        }
        else {
            result = (A+B)*C/2;
            System.out.printf("Area = %.1%n",result);
        }
    }
}