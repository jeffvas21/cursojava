import java.util.Scanner;
public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int senha = 2002;
        int entrada = 0;
    
    while(entrada!=senha){

        entrada = teclado.nextInt();
        if (entrada != senha){
        System.out.println("Senha Invalida");
        }    
    }
    System.out.println("Acesso Permitido");
    }
}