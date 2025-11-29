/**
 * ComputerScienceProgrammingWithaPurpose
 *
 * @author liusiying
 * @date 11/30/25 1:42 AM
 */

public class GreatCircle {
    public static void main(String[] args) {
        double lat1 = Math.toRadians(Double.parseDouble(args[0]));
        double lon1 = Math.toRadians(Double.parseDouble(args[1]));
        double lat2 = Math.toRadians(Double.parseDouble(args[2]));
        double lon2 = Math.toRadians(Double.parseDouble(args[3]));

        double dlat = lat2 - lon1;
        double dlon = lon2 - lon1;

        double distance = 2 * 6371.0 *
                Math.asin(
                        Math.sqrt(
                                Math.sin(dlat / 2) * Math.sin(dlat / 2)+
                                Math.cos(lat1) * Math.cos(lat2) * Math.sin(dlon / 2) * Math.sin(dlon / 2)));

        System.out.println(distance + " kilometers");
    }
}