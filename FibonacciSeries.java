package fibonacciseries;

import java.util.Scanner;

/**
 *
 * @author EMPERO EMMA
 */
public class FibonacciSeries {

   
    public static void main(String[] args) {
        // my code logic goes here
        
        int count, num1 = 0, num2 = 1;
        System.out.print("How any numbers you want in a sequence: ");
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        input.close();
        System.out.print("Fibonacci Series of " + count + " numbers: ");
        
        int i = 1;
        while(i <= count)
        {
            System.out.print(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
    
}
