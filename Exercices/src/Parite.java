import java.util.Scanner;
public class Parite {
    public static void main(String[] args){
        Scanner scanne =new Scanner(System.in);
        System.out.print("Entrer le nombre a tester: ");
        float a = scanne.nextFloat();

        if ((a%2 == 0)){
            System.out.print(a + " est pair");
        }
        else if ((a%3 == 0)){
            System.out.print(a + " est divisible par 3");
        }
        else {
            System.out.print(a + " est impair");
        }
    }
}
