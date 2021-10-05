import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class ecommp {
    public static void main(String[] args){

        //variable declarations
        String country;
        float age;

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