import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class ecommp {
    public static void main(String[] args){

        //variable declarations
        String country;
        float age;

        JFrame frame = new JFrame();


        // requesting country of residence
        country = JOptionPane.showInputDialog(frame, "Enter Country of residence");

        System.out.println(country);

        // requesing age
        
        age =  Float.parseFloat(JOptionPane.showInputDialog(frame, "Enter Age"));
        // taking input for age
        System.out.println(age);

        // checking for eligibility

        if (country.equals("GHANA") && age > 17) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        System.exit(0);
    }
}