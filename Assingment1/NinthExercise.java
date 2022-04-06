import java.util.Scanner;

public class NinthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(ninthExercise(n, k));
    }

    private static int ninthExercise(int n, int k) {
        if(k == 0) {
            return 1;
        }
        if(k == n) {
            return 1;
        }

        return ninthExercise(n-1, k-1) + ninthExercise(n-1, k);
    }
}