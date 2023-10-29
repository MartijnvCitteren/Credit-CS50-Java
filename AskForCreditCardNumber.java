package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class AskForCreditCardNumber {
    static long askCardNumber(){
        long creditCardNumber = 0;

        Scanner askInput = new Scanner(System.in);

        try{
            System.out.println("What is the credit card number you want to validate");
            creditCardNumber = askInput.nextLong();
            if ((creditCardNumber > 1000000000000L) && (creditCardNumber < 9999999999999999L)) {
                System.out.printf("Card number: %d\n", creditCardNumber);
                return creditCardNumber;
            } else {
                System.out.printf("Card number: %d  \nINVALID",creditCardNumber);
                exit(1);
            }
        } catch (InputMismatchException e) {
            System.out.println("Input should be a number without spaces or dashes");
            exit(1);
        }
        return 0;
    }
}
