public class Main {
    public static void main(String[] args){
        Animal a = new Dog();
        System.out.println("--- Before fixing ---");
        try {
            Cat c = (Cat) a; 
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }
        System.out.println("--- After fixing ---");
        if (a instanceof Cat){
            Cat c = (Cat) a;
            c.makeSound();
        } else {System.out.println("It's not Cat");}
    }
}
