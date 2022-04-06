import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(firstExercise(sc));
        System.out.println(secondExercise(sc));
        System.out.println(thirdExercise(sc));
    }

    private static int firstExercise(Scanner sc) {
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];

        for(int i=0; i<lengthArr; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i=0; i<lengthArr; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    private static double secondExercise(Scanner sc) {
        int length = sc.nextInt();
        int[] arr = new int[length];

        for(int i=0; i<length; i++) {
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        double average;
        for(int i=0; i<length; i++) {
            sum+=arr[i];
        }
        average = sum/length;

        return average;
    }

    private static String thirdExercise(Scanner sc) {
        int number = sc.nextInt();

        for(int i=2; i<number; i++) {
            if(number%i == 0) {
                return "Composite";
            }
        }

        return "Prime";
    }
}
