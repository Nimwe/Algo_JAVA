package algojava;

public class MinMax {

    public static void main(String[] args) {

        // ✅ solution
        int A = 17;
        int B = 4;
        int C = 20;
        int min = A;
        int max = A;

        if (B < min) {
            min = B;
        }
        if (C < min) {
            min = C;
        }
        System.out.println(min);

        if (B > max) {
            max = B;
        }
        if (C > max) {
            max = C;
        }
        System.out.println(max);

    }
}