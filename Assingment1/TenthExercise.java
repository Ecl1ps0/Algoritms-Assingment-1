import java.util.Scanner;

public class TenthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(tenthExercise(a, b));
    }

    private static int tenthExercise(int a, int b) {
        if(a == b) {
            return a;
        }
        if(a > b) {
            return tenthExercise(a-b,b);
        } else {
            return tenthExercise(a, b-a);
        }
    }
}