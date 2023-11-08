package Homework_1;

public class Task_1 {
    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount < 0 || discountAmount < 0) {
            throw new ArithmeticException("Invalid arguments");
        }
        double discount = purchaseAmount * discountAmount / 100.0;
        return purchaseAmount - discount;
    }
}
