import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            
            char type = line.charAt(0);
            
            int firstQuote = line.indexOf('"');
            int lastQuote = line.lastIndexOf('"');
            
            String name = line.substring(firstQuote + 1, lastQuote);
            
            String numbersStr = line.substring(lastQuote + 1).trim();
            String[] nums = numbersStr.split(" "); 

            if (type == 'F') {
                double baseSalary = Double.parseDouble(nums[0]);
                double bonus = Double.parseDouble(nums[1]);
                double penalty = Double.parseDouble(nums[2]);
                
                employees[i] = new FullTimeEmployee(name, "", "", baseSalary, bonus, penalty);
                
            } else if (type == 'P') {
                double workingHours = Double.parseDouble(nums[0]);
                double hourlyRate = Double.parseDouble(nums[1]);
                
                employees[i] = new PartTimeEmployee(name, "", "", workingHours, hourlyRate);
            }
        }

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - " + emp.getEmployeeType() + " - " + emp.calculateSalary());
        }

        scanner.close();
    }
}