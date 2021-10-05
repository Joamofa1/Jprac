import java.util.Scanner;
public class number {
    public static void main(String [] args){
        // array declaration 
        int values[] = new int[3];
        int totalSum = 0;

        // console output to instruct user what to do
        System.out.println("Enter 3 numbers");

        // creation of scanner object to use scanner methods to take input
        Scanner input = new Scanner(System.in);

        // loop to store inputs into the array

        for (int i = 0; i < 3; i++) {
            values[i] = input.nextInt();
        }

        // loop to find the largest number
        int max = values[0];
        for (int i = 1; i < 3; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }

        // outputting the max value
        System.out.println("Max value is " + max);

        // finding average to find the average
        for (int i = 0; i < 3; i++){
            totalSum += values[i];
        }
        int average = totalSum/3;

        //outputing average

        System.out.println("average of the 3 numbers is " + average);
    }
}