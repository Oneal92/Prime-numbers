/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumbers;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String quit = "n";
        
        while (!quit.equalsIgnoreCase("y")) {
            System.out.print("Enter a positive integer: ");
            int num = scanner.nextInt();
            
            System.out.print("The following are all of the prime numbers from 1 up to " + num + ": ");
            for (int i = 2; i <= num; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();  // Move to the next line after printing primes
            
            System.out.print("Do you want to quit? (y/n): ");
            quit = scanner.next();
        }
        System.out.println("Program terminated.");
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
