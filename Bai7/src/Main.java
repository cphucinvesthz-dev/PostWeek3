import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int days = Integer.parseInt(parts[1]);
        if (parts[0].equals("S")){
            System.out.println((new Standard()).getBill(days));
        } else if (parts[0].equals("V")){
            System.out.println((new VIP()).getBill(days));
        }
    }
}
