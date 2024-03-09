import java.util.Scanner;
public class Exercice24 {
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
            int plusGrandEcart = calculerPlusGrandEcart(tableau);
            System.out.println("Tableau : ");
            for (int element : tableau) {
                System.out.print(element + " ");
            }
            System.out.println("\nPlus grand écart : " + plusGrandEcart);

            scanner.close();
        }

        private static int calculerPlusGrandEcart(int[] tableau) {
            int plusGrandEcart = 0;

            for (int i = 0; i < tableau.length - 1; i++) {
                for (int j = i + 1; j < tableau.length; j++) {
                    int ecart = Math.abs(tableau[i] - tableau[j]);
                    if (ecart > plusGrandEcart) {
                        plusGrandEcart = ecart;
                    }
                }
            }

            return plusGrandEcart;
        }
    }

