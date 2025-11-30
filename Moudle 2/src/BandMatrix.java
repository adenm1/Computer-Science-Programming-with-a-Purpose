/**
 * ComputerScienceProgrammingWithaPurpose
 *
 * @author liusiying
 * @date 11/30/25 10:54 PM
 */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // distance
                int distance = Math.abs(i - j);

                if (distance > width) System.out.print("0  ");
                else System.out.print("*  ");
            }
            System.out.println();
        }
    }
}