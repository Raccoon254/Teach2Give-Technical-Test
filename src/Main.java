// Main class to run the programs for the questions.
public class Main {
    public static void main(String[] args) {
        // Question 1: FizzBuzz
        FizzBuzz.run();
        // Question 2: Fibonacci Sequence
        Fibonacci.run();
        // Question 3: Power of Two
        PowerOfTwo.run();
        // Question 4: Capitalize Words
        CapitalizeWords.run();
        // Question 5: Reverse Integer
        ReverseInteger.run();
        // Question 6: Count Vowels
        CountVowels.run();
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

// Question 4: Capitalize Words
// Write a program that accepts a string as input, capitalizes the first letter of each word in the
// string, and then returns the result string.

class CapitalizeWords {
    public static String capitalizeWords(String input) {
        char[] chars = input.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i])) {
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    public static void run() {
        String input = "i love programming"; // Example input
        System.out.println(capitalizeWords(input));
    }
}


// Question 5: Reverse Integer
// Write a program that takes an integer as input and returns an integer with reversed digit
// ordering.

class ReverseInteger {
    public static int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reversed;
        }
    }

    public static void run() {
        int input = 123; // Example input
        System.out.println(reverse(input));
    }
}


// Question 6: Count Vowels
// Write a program that counts the number of vowels in a sentence.

class CountVowels {
    public static int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    public static void run() {
        String input = "Hello World"; // Example input
        System.out.println(countVowels(input) + " vowels found.");
    }
}