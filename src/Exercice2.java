import java.util.Scanner;
public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] tableau = new int[10];


        System.out.println("Veuillez entrer les 10 éléments du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }


        System.out.println("Le contenu du tableau est :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " + (i + 1) + " : " + tableau[i]);
        }

        scanner.close();
    }
}


