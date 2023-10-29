package org.example;

public class CardBrand {
    static void checkBrand (long cardNumber){
        // first get the first two numbers
        while (cardNumber > 99){
            cardNumber = cardNumber / 10;
        }
        int brandNumber = (int) cardNumber;

        // Determine CreditCard brand based on CardNumbers
        if (brandNumber == 34 || brandNumber == 37){
            System.out.println("AMEX");
        } else if (brandNumber >= 40 && brandNumber <= 49) {
            System.out.println("VISA");
        } else if (brandNumber >= 51 && brandNumber <= 55) {
            System.out.println("MASTERCARD");
        } else {
            System.out.println("INVALID");
        }
    }
}
