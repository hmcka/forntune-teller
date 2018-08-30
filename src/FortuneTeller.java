import java.util.InputMismatchException;
import java.util.Scanner;

public class FortuneTeller {

	//test the opposite of all variables for all questions
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();
 
		String lastName;
		System.out.println("What is your last name?");
		lastName = input.nextLine();

		int ageInYears = 0;
		boolean success = false;
        while (!success) {
            try {
                System.out.print("Enter your age in years: ");
                ageInYears = input.nextInt();
                if (ageInYears>0) {
                	success = true;
                }
                else if (ageInYears <= 0) {
                    System.out.print("Come on... you are older than that. ");

                }
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("You have entered invalid data.");
            }
        }
		
		String yearsUntilRetirement;
		if(ageInYears % 2 == 0)
			yearsUntilRetirement = "14";
        else
			yearsUntilRetirement = "44";

		int birthMonth = 0;
		success = false;
        while (!success) {
            try {
                System.out.print("What is the number of the month were you born in? ");
                birthMonth = input.nextInt();
                if (birthMonth <= 0) {
                    System.out.print("Seriously. ");
                	}
                else if (birthMonth > 12) {
                    System.out.print("Seriously. ");
                }
                else if (birthMonth <= 12) {
                	success = true;
                }
                
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("You have entered invalid data.");
            }
        }
		
		String bankAccount;
		if(birthMonth >= 1 && birthMonth <=4)
			bankAccount = "a billion dollars";
        else if (birthMonth >= 5 && birthMonth <=8)
        	bankAccount = "5,000 pennies";
        else if (birthMonth >= 9 && birthMonth <=12)
        	bankAccount = "$445,678";
        else
        	bankAccount = "$109,000";

		String favoriteColor;
		System.out.print("What is your favorite ROYGBIV color? ");
		favoriteColor = input.nextLine();
		
		String transportation = null;
		while (transportation == null) {
			if (favoriteColor.equalsIgnoreCase("red")){
			transportation="scooter";
		}
		else if (favoriteColor.equalsIgnoreCase("orange")){
			transportation="jet pack";
		}
		else if (favoriteColor.equalsIgnoreCase("yellow")){
			transportation="hot air balloon";
		}
		else if (favoriteColor.equalsIgnoreCase("green")){
			transportation="car";
		}
		else if (favoriteColor.equalsIgnoreCase("blue")){
			transportation="train";
		}
		else if (favoriteColor.equalsIgnoreCase("indigo")){
			transportation="goat";
		}
		else if (favoriteColor.equalsIgnoreCase("violet")){
			transportation="bus";
		}
		else if (favoriteColor.equalsIgnoreCase("help")){
			System.out.println("ROYGBIV means that you can pick from this color palette: red, orange, yellow, green, blue, indigo and violet.");
			System.out.println("What is your favorite ROYGBIV color? Type help to get a list of options.");
			favoriteColor = input.nextLine();
			transportation = null;
		}
		else {
        	System.out.println("Select one of the six colors, or type help if you are confused."); 
        	favoriteColor = input.nextLine();
			transportation = null;
		}
	}
		
		int siblings = 0;
		success = false;
        while (!success) {
            try {
                System.out.print("How many siblings do you have? ");
                siblings = input.nextInt();
                success = true;
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("You have entered invalid data.");
            }
        }
		
		String location;
		if (siblings==0) {
			location = "Bora Bora";
		} else if (siblings==1) {
			location = "Tuscani";
		}	else if (siblings==2) {
			location = "Costa Rica";
		}	else if (siblings==3) {
			location = "Capetown";
		}	else if (siblings>3) {
			location = "Bahamas";
		}	else {
			location = "Hawaii, by the volcano";
		}
		
		System.out.println(firstName + " " + lastName + 
				" will retire in " + yearsUntilRetirement + " years with " + bankAccount + 
				" in the bank and a vacation home in " + location + ". You enjoy traveling by " + transportation + ".");
		
	}
}


