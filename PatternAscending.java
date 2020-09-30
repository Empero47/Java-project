package pattern;


/**
 *
 * @author EMPERO EMMA
 */
public class PatternAscending {
     /**
        * Simple pyramid pattern
        * **
        * ***
        * ****
        * *****
        * *******
    */
        
    // Function to demonstrate printing pattern
    public static void printStars(int n)
    {
        int i, j;

        //outer loop to handle the number of rows
        // n in this case
        for(i = 0; i < n; i++)
        {
            // inner loop to handle number of columns
            // values changing according to outer loop
            for(j = 0; j <= i; j++)
            {
                System.out.print("*");
            }

            // end line after each row
            System.out.println("");
        }
    }
        
    // the entry point     
    public static void main(String[] args) {
       System.out.println("Outputting star pattern in ascending order: ");
       int n = 7;
       printStars(n);
    }
    
}
