import java.util.Scanner;
public class Echange {
    public static void main (String[] args){
        Scanner scanne = new Scanner(System.in);
        System.out.print("Entrer a: ");
        float a = scanne.nextFloat();
        System.out.print("Entrer b: ");
        float b = scanne.nextFloat();

        System.out.print("Avant la permutation: \n a: " + a + " et b: "+ b + "\n");
        float c = a;
        a = b;
        b = c;

        System.out.print("Apres la permutation: \n a: " + a + " et b: "+b);
    }
}
