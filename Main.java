package org.example;

import static org.example.AskForCreditCardNumber.askCardNumber;
import static org.example.LuhnsAlgorithm.algorithm;
import static org.example.CardBrand.checkBrand;

public class Main {
    public static void main(String[] args) {
        long cardNumber = askCardNumber();
        boolean passedLuhns = algorithm(cardNumber);

        if (passedLuhns){
            checkBrand(cardNumber);
        } else {
            System.out.println("INVALID");
        }
    }

}