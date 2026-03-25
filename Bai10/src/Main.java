import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().strip());
        for (int i = 0; i < n; i++){
            String[] parts = sc.nextLine().split(" ");
            String type = parts[0];
            String name = parts[1];
            double baseSalary = Double.parseDouble(parts[2]);
            if (type.equals("E")){
                employees.add(new Employee(name, baseSalary));
            } else if (type.equals("D")){
                int overtimeHours = Integer.parseInt(parts[3]);
                employees.add(new Developer(name, baseSalary, overtimeHours));
            } else if (type.equals("T")){
                int bugsFound = Integer.parseInt(parts[3]);
                employees.add(new Tester(name, baseSalary, bugsFound));
            }
        }
        System.out.println();
        System.out.println("-------OUTPUT-------");
        for (Employee e: employees){
            System.out.println(e);
            if (e instanceof Developer){
                System.out.println("Give AWS course");
            } else if (e instanceof Tester){
                System.out.println("Give tool test");
            }
            System.out.println();
        }
    }
}
