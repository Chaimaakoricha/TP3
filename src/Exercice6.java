import java.util.Scanner;
public class Exercice6 {
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
        int[] TP = new int[N];
        int[] TN = new int[N];
        int indexTP = 0, indexTN = 0;
        for (int i = 0; i < N; i++) {
            if (T[i] > 0) {
                TP[indexTP] = T[i];
                indexTP++;
            } else if (T[i] < 0) {
                TN[indexTN] = T[i];
                indexTN++;
            }
        }
        System.out.println("Tableau des éléments positifs :");
        for (int i = 0; i < indexTP; i++) {
            System.out.print(TP[i] + " ");
        }
        System.out.println();

        System.out.println("Tableau des éléments négatifs :");
        for (int i = 0; i < indexTN; i++) {
            System.out.print(TN[i] + " ");
        }

        scanner.close();
    }

}
