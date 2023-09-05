/*Print input number factorial with a loop*/

import java.util.Scanner;

public class LoopFactorial{
    public static void main(String []args){
        while(true){
            System.out.println("Please enter a number to calculate it's factorial :");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            System.out.println("*****");
            System.out.println(loopfactorial(number));
            System.out.println("****************************************************");
        }
    }
    
    public static int loopfactorial(int n){
        int sum = 1;
        for(int i = n; i>0; i--){
            sum *= i;
        }
        return sum;
    }
}


// by Arman Azarnik
// armanazarnik@gmail.com