/**
 * ComputerScienceProgrammingWithaPurpose
 *
 * @author liusiying
 * @date 11/30/25 11:07 PM
 */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0, steps = 0;

        System.out.println("(" + x + ", " + y + ")"); // Start

        while (Math.abs(x) + Math.abs(y) < r) {
            double direction = Math.random(); // 0: North, 1: East, 2: South, 3: West. random() return: [0.0, 1.0)

            if (direction < 0.25) y++; // from 0.0 to 0.25 (North)
            else if (direction < 0.5) x++; // from 0.25 to 0.5 ( East)
            else if (direction < 0.75) y--; // 0.5 to 0.75 (South)
            else x--; // 0.75 to 1.0 (West)

            steps++;

            System.out.println("(" + x + ", " + y + ")"); // Duration
        }

        System.out.println("(" + x + ", " + y + ")"); // Final steps
        System.out.println("steps = " + steps);
    }
}