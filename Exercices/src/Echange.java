import java.util.Scanner;
public class Echange {
    public static void main (String[] args){
        Scanner scanne = new Scanner(System.in);

        //Saisie des données
        System.out.print("Entrer a: ");
        int a = scanne.nextInt();
        System.out.print("Entrer b: ");
        int b = scanne.nextInt();

        System.out.print("Avant la permutation: \n a: " + a + " et b: "+ b + "\n");
        int c = a; //Variable temporaire pour stocker la valeur de a
        a = b;
        b = c;

        System.out.print("Apres la permutation: \n a: " + a + " et b: "+b);
        scanne.close();
    }
}
