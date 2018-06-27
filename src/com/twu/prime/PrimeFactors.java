package com.twu.prime;

import com.twu.utils.Utils;

import java.util.ArrayList;

public class PrimeFactors {
    public static void main(String[] args) {
        int number;
        PrimeFactors prime = new PrimeFactors();
        number = Utils.getNumberInput();
        prime.generate(number);
    }

    void generate(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n = n / 2;
        }
        double maxNumberToTest = Math.sqrt(n);
        for (int i = 3; i < maxNumberToTest; i = i + 2) {
            while (n % i == 0) {
                factors.add(i);
                n = n / i;
            }
        }
        if (n > 2) {
            factors.add(n);
        }
        print(factors);
    }

    void print(ArrayList<Integer> factors) {
        for (int number : factors) {
            System.out.print(number + " ");
        }
    }
}
