import java.util.Scanner;
public class Exercice5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez la taille du tableau : ");
            int N = scanner.nextInt();
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
            for (int i = 0; i < N / 2; i++) {
                int temp = T[i];
                T[i] = T[N - 1 - i];
                T[N - 1 - i] = temp;
            }

            System.out.println("Tableau inversé :");
            for (int i = 0; i < N; i++) {
                System.out.print(T[i] + " ");
            }

            scanner.close();
        }
    }

