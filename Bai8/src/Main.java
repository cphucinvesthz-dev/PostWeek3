import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().strip());
        List<Robot> robots = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String[] parts = sc.nextLine().trim().split(" ");
            String type = parts[0];
            int id = Integer.parseInt(parts[1]);
            String modelName = parts[2];

            if (type.equals("DR")) {
            robots.add(new DroneRobot(id, modelName));
            } else if (type.equals("FR")) {
                robots.add(new FishRobot(id, modelName));
            } else if (type.equals("AR")) {
                robots.add(new AmphibiousRobot(id, modelName));
            }
        }
        System.out.println("---------------OUTPUT---------------");
        for (Robot robot : robots) {
            robot.performMainTask();

            if (robot instanceof Flyable) {
                ((Flyable) robot).fly();
            }
            if (robot instanceof GPS) {
                ((GPS) robot).getCoordinates();
            }
            if (robot instanceof Swimmable) {
                ((Swimmable) robot).swim();
            }
            System.out.println();
        }
        // Lấy một đối tượng DroneRobot), thử hàm fly
        System.out.println("--------------- TRY FUNCTION OF FLY ---------------");
        Robot first = robots.get(0); 
        if (first instanceof Flyable) {
            ((Flyable) first).fly();
        }
    }
}
