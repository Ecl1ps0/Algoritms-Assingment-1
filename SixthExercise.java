import java.util.Scanner;

public class SixthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();

        System.out.println(sixthExercise(num, power));
    }

    private static int sixthExercise(int number, int power) {
        if(power == 0) {
            return 1;
        }
        if(power == 1) {
            return number;
        }

        return number * sixthExercise(number, power-1);
    }
}