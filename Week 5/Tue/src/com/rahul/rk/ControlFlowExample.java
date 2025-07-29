package com.rahul.rk;

public class ControlFlowExample {

    public static void main(String[] args) {
        processNumbers();
    }

    public static void processNumbers() {
        for (int i = 1; i <= 10; i++) {

            if (i == 3) {
                System.out.println("Skipping number: " + i);
                continue; // skip number 3
            }

            if (i == 7) {
                System.out.println("Breaking loop at: " + i);
                break; // stop loop at 7
            }

            System.out.println("Number: " + i);
        }

        if (true) {
            System.out.println("Exiting method early using return.");
            return; // exit the method
        }

        // This line won't be executed
        System.out.println("This won't print.");
    }
}
	
