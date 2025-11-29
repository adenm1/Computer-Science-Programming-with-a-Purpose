/**
 * ComputerScienceProgrammingWithaPurpose
 *
 * @author liusiying
 * @date 11/30/25 1:31 AM
 */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println(false);
            return;
        }

        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;
        int other1, other2;

        if (max == a) {
            other1 = b;
            other2 = c;
        } else {
            other1 = b;
            other2 = c;
        }

        boolean isRight = (other1 * other1 + other2 * other2 == max * max);

        System.out.println(isRight);
    }
}