import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(fourthExercise(number));
    }

    private static long fourthExercise(int number) {
        if(number == 1) {
            return number;
        }

        return number * fourthExercise(number-1);
    }
}