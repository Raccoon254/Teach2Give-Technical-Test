// Main class to run the programs for the questions.
public class Main {
    public static void main(String[] args) {
        // Question 1: FizzBuzz
        FizzBuzz.run();
        // Question 2: Fibonacci Sequence
        Fibonacci.run();
        // Question 3: Power of Two
        PowerOfTwo.run();
    }
}

// Question 1: FizzBuzz
// Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for
// multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print
// "FizzBuzz".

class FizzBuzz {
    public static void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

// Question 2: Fibonacci Sequence
// Write a program to generate the Fibonacci sequence up to 100.

class Fibonacci {
    public static void run() {
        int n = 100, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series up to " + n + ":");
        while (firstTerm <= n) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

// Question 3: Power of Two
// Write a program that takes an integer as input and returns true if the input is a power of two.

class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void run() {
        int num = 8; // Example input
        System.out.println(num + "=> returns " + isPowerOfTwo(num));
        num = 6; // Example input
        System.out.println(num + "=> returns " + isPowerOfTwo(num));
    }
}