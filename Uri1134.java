import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int alcool=0, gasolina=0, diesel=0, entrada=0;

    
    while (entrada != 4) {
        entrada=teclado.nextInt();
        switch(entrada) {
            case 1:
                alcool++;
            break;
            case 2:
                gasolina++;
            break;
            case 3:
                diesel++; 
            break;           
        }
    }
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: "+ alcool);
    System.out.println("Gasolina: "+ gasolina);
    System.out.println("Diesel: "+diesel);
    
    }
}