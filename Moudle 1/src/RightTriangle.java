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

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.max(b, c));
        int mid = a + b + c - max - min;

        boolean isRight = (min > 0 && mid > 0 && max > 0) && (min * min + mid * mid == max * max);

        System.out.println(isRight);
    }
}