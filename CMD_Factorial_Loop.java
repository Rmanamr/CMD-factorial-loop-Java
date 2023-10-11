import java.util.Scanner;

/**Java CMD program for printing the factorial of the input number with a for loop.
* using Java version 1.8.0
* @version : 1.0
* @license: MIT License
* @author : Arman Azarnik
* contact me at : armanazarnik@gmail.com
*/
public class CMD_Factorial_Loop{

    /** main class for interacting with the user */
    public static void main(String []args){

        /** while loop to keep the program running */
        while(true){
            System.out.println("Please enter a number to calculate it's factorial :");
            Scanner input = new Scanner(System.in);
            
            /** reading the next integer number and storing it in an integer variable*/
            int number = input.nextInt();
            System.out.println("*****"); 
             
            /** passing the number to factorial_Calculator_Loop method and storing the result in result variable of long data type */
            long result = factorial_Calculator_Loop(number);          
            System.out.println("The factorial of " +number+ " is : " +result);
            System.out.println("****************************************************");
        }
    }

    /** 
     * method for calculating the factorial of input with a for loop.
     * @param number  int number to calculate the factoriaal
     * @return sum  factorial of the input number with long data type
     * <pre>
     *      factorial_Calculator_Loop(0); // Output: 1
     *      factorial_Calculator_Loop(4); // Output: 24
     * </pre>
    */
    public static long factorial_Calculator_Loop(int number){
        /** initializing sum = 1 so 0! would be 1 */
        long sum = 1;
        for(int i = number; i>0; i--){
            sum *= i;
        }
        return sum;
    }
}