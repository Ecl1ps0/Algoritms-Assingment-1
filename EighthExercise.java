import java.util.Scanner;

public class EighthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(eighthExercise(s, 0));
    }

    private static String eighthExercise(String s, int i) {
        if(s.charAt(i)<'0' || s.charAt(i)>'9') {
            return "No";
        }
        if(i == (s.length()-1)) {
            return "Yes";
        }
        return eighthExercise(s,++i);
    }
}