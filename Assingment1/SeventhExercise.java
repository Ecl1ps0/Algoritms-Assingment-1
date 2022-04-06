import java.util.Scanner;

public class SeventhExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for(int i=0; i<length; i++) {
            arr[i] = sc.nextInt();
        }

        seventhExercise(arr, length);
    }

    private static void seventhExercise(int[] arr, int length) {
        if(length == 0) {
            return;
        }
        System.out.print(arr[length-1] + " ");
        seventhExercise(arr, length-1);
    }
}