/**
 * ComputerScienceProgrammingWithaPurpose
 *
 * @author liusiying
 * @date 11/30/25 11:22 PM
 */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        long totalSteps = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0, y = 0, currentTrailSteps = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                double direction = Math.random(); // 0: North, 1: East, 2: South, 3: West. random() return: [0.0, 1.0)

                if (direction < 0.25) y++; // from 0.0 to 0.25 (North)
                else if (direction < 0.5) x++; // from 0.25 to 0.5 ( East)
                else if (direction < 0.75) y--; // 0.5 to 0.75 (South)
                else x--; // 0.75 to 1.0 (West)

                currentTrailSteps++;
            }
            totalSteps += currentTrailSteps;
        }

        double averageSteps = (double) totalSteps / trials;
        System.out.println("average number of steps = " + averageSteps);
    }
}