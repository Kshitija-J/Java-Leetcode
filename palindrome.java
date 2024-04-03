package leetcode;

import java.util.Scanner;

class palindrome {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int original = x;
        if (x < 0) {
            return false;
        } else {
            do {
                int rem = x % 10;
                rev = rev * 10 + rem;
                x = x / 10;
            } while (x > 0);
            System.out.println("Reverse number: " + rev);
            return rev == original;
        }
    }

    public static void main(String[] args) {
        palindrome solution = new palindrome();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to check if it is a palindrome:");
        int number = scanner.nextInt();
        
        boolean isPalindrome = solution.isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + isPalindrome);
        
        scanner.close();
    }
}
