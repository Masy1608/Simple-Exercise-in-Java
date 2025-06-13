import java.util.Scanner;
public class Mois {
    public static void main(String[] args){
        Scanner scanne =new Scanner(System.in);

        //Entrée de données
        System.out.print("Entrer le chiffre: ");
        int a = scanne.nextInt();

        String mois = switch (a){
            case 1 -> "Janvier";
            case 2 -> "Février";
            case 3 -> "Mars";
            case 4 -> "Avril";
            case 5 -> "Mai";
            case 6 -> "Juin";
            case 7 -> "Juillet";
            case 8 -> "Aout";
            case 9 -> "Septembre";
            case 10 -> "Octobre";
            case 11 -> "Novembre";
            case 12-> "Décembre";
            default -> "Pas de mois compatible";
        };

        if (mois != "Pas de mois compatible"){
            System.out.print("Nous sommes le mois de " + mois);
        }
        else {
            System.out.print("Il n'y a que 12 mois dans l'année");
        }
        scanne.close();

    }
}
