public class Somme {
    public static void main(String[] args) {
        int i = 1;
        int S = 0;

        do{
            S += i;
            i++;
        }while(i<11);

        System.out.print("La somme est " + S);
    }
}
