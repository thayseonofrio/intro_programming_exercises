package com.twu.fizzbuzz;

public class FizzBuzz {
    void play() {
        for (int i = 0; i < 100; i++) {
            int number = i + 1;
            if ((number % 3) == 0 && (number % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.play();
    }
}

