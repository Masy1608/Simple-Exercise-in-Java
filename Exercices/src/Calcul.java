import java.util.Scanner;
public class Calcul{
    public static void main(String[] args){
        Scanner scanne =new Scanner(System.in);
        System.out.print("Enter le premier nombre: ");
        float a = scanne.nextFloat();
        System.out.print("Enter le second nombre: ");
        float b = scanne.nextFloat();

        System.out.print("La somme des deux nombre: " + (a+b) + "\n");
        System.out.print("Le produit des deux nombre: " + (a*b) + "\n");
        System.out.print("La division des deux nombre: " + (a/b));
    }
}
