import java.util.Scanner;
public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int ano, mes, dia, entrada, sobra;

        entrada = teclado.nextInt();

        ano = entrada / 365;
        sobra = entrada % 365;
        mes = sobra / 30;
        dia = sobra % 30;

        System.out.println(ano + " ano (s)");
        System.out.println(mes + " mes (es)");
        System.out.println(dia + " dia (s)");
    }
}