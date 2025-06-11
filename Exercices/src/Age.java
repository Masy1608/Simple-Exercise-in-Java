import java.util.Scanner;
public class Age {
    public static void main(String[] args){
        Scanner scanne =new Scanner(System.in);
        System.out.print("Entrer l'age de l'enfant: ");
        byte age = scanne.nextByte();

        if ( (age>=6) && (age<=7) ){
            System.out.print("L'enfant est un poussin ");
        }
        else if ( (age>=8) && (age<=9) ){
            System.out.print("L'enfant est un pupille ");
        }
        else if ( (age>=10) && (age<=11) ){
            System.out.print("L'enfant est un minime ");
        }
        else if (age>=12){
            System.out.print("L'enfant est un cadet ");
        }
        else if (age<6){
            System.out.print("L'enfant est un bebe ");
        }
    }
}
