package org.example;

public class LuhnsAlgorithm {
    static boolean algorithm(long cardNumber){
        int sum = sumNumbers(cardNumber);

        if (sum % 10 == 0){
            return true;
        }
        return false;
    }

    static int sumNumbers (long cardNumber){
        long tmpNumber;
        int lastNumber;
        int sumAllNumbers = 0;
        int count = 0;

        while(cardNumber > 0){
            count ++;
            tmpNumber = cardNumber % 10;
            lastNumber = (int) tmpNumber;

            //check if it's the first or 2nd number from behind
            if (count % 2 == 0) {
                if ((lastNumber * 2) > 9) {
                    sumAllNumbers += splitTwoValueNumbers(lastNumber);
                } else {
                    sumAllNumbers += lastNumber * 2;
                }
            } else{
                sumAllNumbers += lastNumber;
            }
            cardNumber = cardNumber / 10;
        }

        return sumAllNumbers;
    }

    static int splitTwoValueNumbers(int lastNumber){
        int number = lastNumber * 2;
        int sumTwoValues = (number % 10) + 1;
        //all numbers are between 10 - 18 (9*2), so only check remainder and add one.

        return sumTwoValues;
    }

}
