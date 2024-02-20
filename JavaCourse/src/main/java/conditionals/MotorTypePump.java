package conditionals;

/*
You are developing a website for a company that manufactures motors 
(let’s assume that it is the type of motor of a pump to move fluids). 
Define a variable MotorType and allow the user to enter a value between 1 and 4. 
The program should display the following:
-If the motor type is 1, display “The pump is a water pump”.
-If the motor type is 2, display “The pump is a gasoline pump”.
-If the motor type is 3, display “The pump is a concrete pump”.
-If the motor type is 4, display “The pump is a food paste pump”.
-If none of the above values are met, then “No valid value for pump type”. 
 */
import java.util.Scanner;

public class MotorTypePump {

    public static void main(String[] args) {

        int motorType;

        System.out.println("Enter a number between 1 and 4 to identify "
                + "the motor type.");
        Scanner scanner = new Scanner(System.in);
        motorType = scanner.nextInt();

        switch (motorType) {
            case 1:
                System.out.println("The pump is a water pump.");
                break;
            case 2:
                System.out.println("The pump is a gasoline pump.");
                break;
            case 3:
                System.out.println("The pump is a concrete pump.");
                break;
            case 4:
                System.out.println("The pump is a food paste pump.");
                break;
            default:
                System.out.println("No valid value for pump type.");
        }
    }

}
