import java.util.Scanner;
public class Uri1019{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int duracao, hr, min, seg, sobra;

        duracao = teclado.nextInt();

        hr = duracao / 3600;
        sobra = duracao % 3600;
        min = sobra / 60;
        seg = sobra % 60;

        System.out.println(hr + ":" + min + ":" + seg);
        
    }
}