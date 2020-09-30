/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;


/**
 *
 * @author EMPERO EMMA
 */
public class PatternDescending {
    /**
        * Simple pyramid pattern
        * **********
        * ********
        * ******
        * ***
        * **
    */

    // Function to demonstrate printing pattern
    public static void main(String[] args)  
    {  
        int rows=7;      
        //inner loop  
        for (int i= rows-1; i>=0 ; i--)  
        {  
        //outer loop  
        for (int j=0; j<=i; j++)  
        {  
        //prints star and space  
        System.out.print("*" + " ");  
        }  
        //throws the cursor in the next line after printing each line  
        System.out.println();  
        }  
    }  
}
