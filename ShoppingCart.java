package shopbasket;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {
        
        ArrayList<Product> basket = new ArrayList<>();
        basket.add(new Product("Leather wallet", 1100, 18, 1));
        basket.add(new Product("Umbrella", 900, 12, 4));
        basket.add(new Product("Cigarette", 200, 28, 3));
        basket.add(new Product("Honey", 100, 0, 2));

        
        Product maxGSTProduct = getMaxGSTProduct(basket);
        System.out.println("Product with maximum GST amount: " + maxGSTProduct.name);

       
        double totalAmount = calculateTotalAmount(basket);
        System.out.println("Total amount to be paid to the shopkeeper: Rs. " + totalAmount);
    }

    public static Product getMaxGSTProduct(ArrayList<Product> basket) {
        Product maxGSTProduct = null;
        double maxGSTAmount = 0;

        for (Product product : basket) {
            double gstAmount = product.getTotalPrice() - (product.unitPrice * product.quantity);
            if (gstAmount > maxGSTAmount) {
                maxGSTAmount = gstAmount;
                maxGSTProduct = product;
            }
        }

        return maxGSTProduct;
    }

    public static double calculateTotalAmount(ArrayList<Product> basket) {
        double totalAmount = 0;
        

        for (Product product : basket) {
            
            if(product.getTotalPrice()>=500){
               double discount=product.getTotalPrice()*0.05;
               totalAmount+=product.getTotalPrice()-discount;
            }else{
                totalAmount += product.getTotalPrice();
            }
        }

        return totalAmount;
    }
}