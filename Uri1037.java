import java.util.Scanner;
public class Uri1037{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        float ent;

        ent = teclado.nextFloat();

        //  intervalos ([0,25], (25,50], (50,75], (75,100]) 

        if ((ent >= 0) && (ent <= 25)){
            System.out.println("Intervalo [0,25]");
        }
        else if ((ent > 25) && (ent <=50)){
            System.out.println("Intervalo (25,50]");
        }
        else if ((ent > 50) && (ent <=75)){
            System.out.println("Intervalo (50,75]");
        }
        else if ((ent > 75) && (ent <=100)){
            System.out.println("Intervalo (75,100]");
        }
        else System.out.println("Fora de intervalo");
        
    }
}
