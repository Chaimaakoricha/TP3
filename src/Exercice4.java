import java.util.Scanner;
public class Exercice4 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int N;
                do {
                    System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
                    N = scanner.nextInt();
                } while (N < 10 || N > 50);
                int[] T = new int[N];
                System.out.println("Entrez les éléments du tableau :");
                for (int i = 0; i < N; i++) {
                    System.out.print("Element " + (i + 1) + " : ");
                    T[i] = scanner.nextInt();
                }
                System.out.println("Tableau initial :");
                for (int i = 0; i < N; i++) {
                    System.out.print(T[i] + " ");
                }
                System.out.println();
                int tailleApresSuppression = supprimerEtTasser(T, N, 5);

                System.out.println("Tableau après suppression de 5 :");
                for (int i = 0; i < tailleApresSuppression; i++) {
                    System.out.print(T[i] + " ");
                }

                scanner.close();
            }

            private static int supprimerEtTasser(int[] tableau, int taille, int elementASupprimer) {
                int indexDestination = 0;

                for (int indexSource = 0; indexSource < taille; indexSource++) {
                    if (tableau[indexSource] != elementASupprimer) {
                        tableau[indexDestination] = tableau[indexSource];
                        indexDestination++;
                    }
                }

                return indexDestination;
            }
        }



