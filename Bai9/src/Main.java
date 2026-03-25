import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<IPayable> payableList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().strip());
        double totalPayment = 0;
        for (int i = 0; i < n; i++){
            String[] parts = sc.nextLine().split(" ");
            String type = parts[0];
            if (type.equals("S")){
                String id = parts[1];
                String name = parts[2];
                int workingHours = Integer.parseInt(parts[3]);
                double hourlyRate = Double.parseDouble(parts[4]);
                payableList.add(new PartTimeStaff(id, name, hourlyRate, workingHours));
            } else if (type.equals("I")){
                String itemName = parts[1];
                int quantity = Integer.parseInt(parts[2]); 
                double pricePerItem = Double.parseDouble(parts[3]);
                payableList.add(new Invoice(itemName, quantity, pricePerItem));
            }
        }
        System.out.println();
        System.out.println("---------------OUTPUT---------------");
        for (IPayable price: payableList){
            totalPayment += price.getPaymentAmount();
            System.out.println(price);
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        System.out.println("Total Payment = " + totalPayment);
    }
}
