import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        Order order = new Order();
        System.out.println("---------------OUTPUT---------------");
        for (int i = 0; i < n; i++){
            String line = scanner.nextLine().trim();
            String[] parts = line.split(" ");
            String id = parts[0];
            String name = parts[1].replace("\"", "");
            double price = Double.parseDouble(parts[2]);
            if (id.equals("E")){
                double warranty = Double.parseDouble(parts[3]);
                order.addProduct(new Electronics(name, price, warranty));
            } else if (id.equals("F")){
                LocalDate expiryDate = LocalDate.parse(parts[3]);
                order.addProduct(new Food(name, price, expiryDate));
            } 
        }
        System.out.println("------------------------------");
        order.printOrder();
    }
}
