import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.Scanner;
public class assignment {
    public static void main(String[] args){
        /* Question 1 finding largest interger 
        and average of 3 integers */

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
        // since the question said all numbers should be in int
        // average is left as int
         int average = totalSum/3;

        //outputing average

        System.out.println("average of the 3 numbers is " + average);

        /* Question 2 checking for eligibility with scanner */

        //variable declarations
        String country;
        float age;


        // requesting country of residence
        System.out.println("Enter country of residence, input should be in caps");

        // not an error its there for a purpose
        input.nextLine();

        // taking string input of residence
        country = input.nextLine();

        // requesing age
        System.out.println("Input age");

        // taking input for age
        age = input.nextFloat();

        // checking for eligibility

        if (country.equals("GHANA") && age > 17) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }


        /* Question 2 again but this time with JOption pane */
        //variable declarations

        // jframe object creation
        JFrame frame = new JFrame();


        // requesting country of residence
        country = JOptionPane.showInputDialog(frame, "Enter Country of residence");

        // requesing age
        age =  Float.parseFloat(JOptionPane.showInputDialog(frame, "Enter Age"));

        // checking for eligibility
        if (country.equals("GHANA") && age > 17) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        System.exit(0);
    }
}