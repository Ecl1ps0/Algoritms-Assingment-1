import java.util.Scanner;

public class FifthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println(fifthExercise(length));
    }

    public static int fifthExercise(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        return fifthExercise(n-1) + fifthExercise(n-2);
    }
}