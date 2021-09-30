package code2rithik.github.io;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 6;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3,4 or 5");
                 break;
        }

        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // Add a default which displays a message saying not found

        char myCharValue = 'G';
        switch(myCharValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(myCharValue + " was found");
                break;

            default:
                System.out.println("Could not find, A, B, C, D or E");
                break;
        }

        String month = "janUArY";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
