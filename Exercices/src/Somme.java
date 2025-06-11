import java.util.Scanner;
public class Somme {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        System.out.print("Entrer un entier: ");
        int a =  scanne.nextInt();
        int i = 1;
        int S = 0;

        do{
            S += i;
            i++;
        }while(i<(a+1));

        System.out.print("La somme est " + S);
    }
}
