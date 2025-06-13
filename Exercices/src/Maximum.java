import java.util.Scanner;
public class Maximum {
    public static void main(String[] args){
        Scanner scanne =new Scanner(System.in);

        //Entrées des données
        System.out.print("Entrer le premier chiffre: ");
        float a = scanne.nextFloat();
        System.out.print("Entrer le second chiffre: ");
        float b = scanne.nextFloat();
        System.out.print("Entrer le troisieme chiffre: ");
        float c = scanne.nextFloat();

        float max = a; //Initialiser la valeur maximale par a
        if (a<b && c<b){
            max = b;
        }
        else if (a<b && b<c){
            max = c;
        }

        System.out.print("Le maximum entre les 3 nombres est: " + max );

        scanne.close();
    }
}
