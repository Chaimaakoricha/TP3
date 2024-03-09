import java.util.Arrays;
import java.util.Scanner;
public class Exercice7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez la taille du tableau : ");
            int taille = scanner.nextInt();
            int[] tableau = new int[taille];
            System.out.println("Saisissez les éléments du tableau :");
            for (int i = 0; i < taille; i++) {
                System.out.print("Élément " + (i + 1) + " : ");
                tableau[i] = scanner.nextInt();
            }
            int somme = 0;
            for (int element : tableau) {
                somme += element;
            }
            double moyenne = (double) somme / taille;
            System.out.println("Tableau original : " + Arrays.toString(tableau));
            int[] T2 = Arrays.copyOf(tableau, taille);
            System.out.println("Deuxième tableau T2 : " + Arrays.toString(T2));
            Arrays.sort(tableau);
            System.out.println("Tableau trié dans l'ordre croissant : " + Arrays.toString(tableau));

            System.out.println("Somme des éléments : " + somme);
            System.out.println("Moyenne des éléments : " + moyenne);

            scanner.close();
        }
    }



