import java.util.Scanner;
public class ecomission {
    public static void main(String[] args){

        //variable declarations
        String country;
        float age;

        //scanner object creation to take objects

        Scanner input = new Scanner(System.in);

        // requesting country of residence
        System.out.println("Enter country of residence, input should be in caps");

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

    }
}