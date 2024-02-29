import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
public class Main {

    public static void main(String[] args){


        int number = getInputNumber();
        
        int sum = sumOfNumbers(number);
        int sum1 = gaussianSumOfNumbers(number);

        
        System.out.println("Using the for loop, sum: "+sum);
        System.out.println("Using the Gaussian method, sum: "+sum1);



    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    public static int sumOfNumbers(int n) {
        long startTime, endTime, elapsedTime;
        startTime = System.nanoTime();
        int total = 0;

        for(int i = 1; i <= n; i++){
            total+= i;
        }
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Using the for loop took: "+elapsedTime+" nanoseconds");
        return total;
    }

    public static int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }

    // for Extra Credit
    public static int gaussianSumOfNumbers(int n) {
        long startTime, endTime, elapsedTime;
        startTime = System.nanoTime();
        double total = .5*n*(n+1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Using the Gaussian method took: "+elapsedTime+" nanoseconds");
        return (int) total;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
