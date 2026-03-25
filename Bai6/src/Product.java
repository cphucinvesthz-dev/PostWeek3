import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Product {
    protected String id;
    protected String name;
    protected double basePrice;

    public Product(String id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract double getFinalPrice();

    public String getName() { return name; }
}

class Electronics extends Product {
    private double warrantyFee;

    public Electronics(String name, double basePrice, double warrantyFee) {
        super("E", name, basePrice);
        this.warrantyFee = warrantyFee;
    }

    @Override
    public double getFinalPrice() {
        return basePrice * 1.10 + warrantyFee;
    }

    @Override
    public String toString() {
        return name + " - Electronics - " + getFinalPrice();
    }
}

class Food extends Product {
    private LocalDate expiryDate;

    public Food(String name, double basePrice, LocalDate expiryDate) {
        super("F", name, basePrice);
        this.expiryDate = expiryDate;
    }

    @Override
    public double getFinalPrice() {
        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), expiryDate);
        if (daysLeft < 7) {
            return basePrice * 0.80;
        }
        return basePrice;
    }

    @Override
    public String toString() {
        return name + " - Food - " + getFinalPrice();
    }
}