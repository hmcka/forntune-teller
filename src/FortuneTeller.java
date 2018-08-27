import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();

		String lastName;
		System.out.println("What is your last name?");
		lastName = input.nextLine();

		int ageInYears;
		System.out.println("What is your age?");
		ageInYears = input.nextInt();
		
		String yearsUntilRetirement;
		if(ageInYears % 2 == 0)
			yearsUntilRetirement = "14";
        else
			yearsUntilRetirement = "44";

		int birthMonth;
		System.out.println("What is the number of your birth month?");
		birthMonth = input.nextInt();
		input.nextLine();
		
		String bankAccount;
		if(birthMonth >= 1 && birthMonth <=4)
			bankAccount = "$14";
        else if (birthMonth >= 5 && birthMonth <=8)
        	bankAccount = "$44";
        else if (birthMonth >= 9 && birthMonth <=12)
        	bankAccount = "$444";
        else
        	bankAccount = "$4444";

		String favoriteColor;
		System.out.println("What is your favorite ROYGBIV color? Type help to get a list of options.");
		favoriteColor = input.nextLine();
		
		String transportation = null;
		//Boolean activeColor = false;
		while (transportation == null) {
			if (favoriteColor.equals("red")){
			transportation="scooter";
			//activeColor = true;
		}
		else if (favoriteColor.equals("orange")){
			transportation="jet pack";
			//activeColor = true;
		}
		else if (favoriteColor.equals("yellow")){
			transportation="hot air balloon";
			//activeColor = true;
		}
		else if (favoriteColor.equals("green")){
			transportation="car";
			// = true;
		}
		else if (favoriteColor.equals("blue")){
			transportation="train";
			//activeColor = true;
		}
		else if (favoriteColor.equals("indigo")){
			transportation="goat";
			//activeColor = true;
		}
		else if (favoriteColor.equals("violet")){
			transportation="bus";
			//activeColor = true;
		}
		else if (favoriteColor.equals("help")){
			System.out.println("ROYGBIV means that you can pick from this color palette: red, orange, yellow, green, indigo and violet.");
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
		

		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		
		String location;
		if (siblings==0) {
			location = "Bora Bora";
		} else if (siblings==1) {
			location = "Rome";
		}	else if (siblings==2) {
			location = "Hawaii";
		}	else if (siblings==3) {
			location = "Capetown";
		}	else if (siblings>3) {
			location = "Bahamas";
		}	else {
			location = "Chernobyl";
		}
		
		System.out.println(firstName + " " + lastName + 
				" will retire in " + yearsUntilRetirement + " years with " + bankAccount + 
				" in the bank and a vacation home in " + location + " and travel by " + transportation + ".");
		
	}

}


