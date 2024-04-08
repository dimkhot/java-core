package org.example.homework4;

public class ProductCostCalculator {
    public static void main(String[] args) {
        double unitPrice = 10.0;
        int quantity = 55;
        double discount = discountValue(quantity);
        System.out.println("Your discount is: " + discount + "%");
        double totalCost = calculateTotalCost(unitPrice, quantity, discount);
        System.out.println("Total cost of the product: " + totalCost);
    }

    private static double discountValue(int quantity) {
        if (quantity > 10 && quantity <= 20) {
            double discount = 5;
            return discount;
        } else if (quantity > 20 && quantity <= 30) {
            double discount = 10;
            return discount;
        } else if (quantity > 30 && quantity <= 80) {
            double discount = 12;
            int quantityValue = quantity - 30;
            double bonusDiscount = (quantityValue / 10) * 0.4;
            discount += bonusDiscount;
            return discount;
        } else if (quantity > 80) {
            double discount = 13;
            return discount;
        } else {
            double discount = 0;
            return discount;
        }

    }

    private static double calculateTotalCost(double unitPrice, int quantity, double discount) {
        double totalCost = unitPrice * quantity * (1 - (discount / 100));
        return totalCost;
    }
}
