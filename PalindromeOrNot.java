/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromeornot;

import java.util.Scanner;

/**
 *
 * @author EMPERO EMMA
 */
public class PalindromeOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
            * Java program to check if the number is palindrome or not.
            * A number is called palindrome if the number and its reverse is equal
            * This Java program can also be used to reverse a number in Java
        */

        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();
       
        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }      
       
    }
 
    /*
     * Java method to check if a number is palindrome or not
     */
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }
    
}
