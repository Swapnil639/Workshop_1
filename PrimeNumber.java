package com.bridgelabz;

public class PrimeNumber {
   public static void primeNumber(int n ){
       int temp = 0;
       System.out.println("Prime numbers are :");
       for (int number = 2; number < n; number++) {
           for (int j = 2; j < number; j++) {
               if (number % j == 0) {
                   temp = temp + 1;
                   break;
               }
           }

           if (temp == 0) {
               System.out.println(number);
           } else {
               temp = 0;
           }
       }
    }
    public static void main(String[] args) {
      primeNumber(100);
    }
}
