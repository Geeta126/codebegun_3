package JavaPrograms;

import java.util.Scanner;

public class ATM {
	static String username;
    static	String password;
	int amount;
	int withdrawAmount;
	int [] denominations= {2000,500,100};
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter username ::");
	String username=sc.next();
	System.out.print("Enter password ::");
	String password=sc.next();
	three(username,password);

	}
	public static void three(String username,String password){
		Scanner sc= new Scanner(System.in);
	if(username.equals("priya")&& password.equals("098765")) {
		System.out.print("Enter amount ::");
		int amount=sc.nextInt();
	}
	}
	void amountMethod() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Amount for Withdrawal: ");
		 withdrawAmount = sc.nextInt();
		 if(withdrawAmount % 100 == 0) {
			 amountDispencer();
			}
		 else if((withdrawAmount<100)) {
			 System.out.println("Please Enter the Amount in the Denominations of '100': ");
				amountMethod();
		}
		
		else {
			System.out.println("Please Enter the Amount in the Denominations of '100': ");
			amountMethod();
		}
	}
	void amountDispencer() {
		int remainingAmount = withdrawAmount;
		System.out.println("Dispensing the Amount: ");
		for(int denomination : denominations) {
			if(remainingAmount >= denomination) {
				int count = remainingAmount / denomination;
				System.out.println(count+" x "+denomination+" Note");
				remainingAmount %= denomination;
		}
		
		if(remainingAmount > 0) {
				System.out.println(remainingAmount + " x 100 Note");
			}
			choiceChecker();
		
		}
	}
		void choiceChecker() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter '1' if you wish to Continue or enter '0' to exit!");
			int continueExitChoice = sc.nextInt();
			if(continueExitChoice == 1) {
			three(username,password);
				}
			else if(continueExitChoice == 0) {
				System.out.println("You have Successfully Exited!");
			}
			else {
				System.out.println("Please Enter one of the two provided choices!");
				choiceChecker();
		}

	}
}     
	
















//public class AtmLogic {
//	int twoThousandNotes = 10;
//	int fiveHundredNotes = 10;
//	int hundredNotes = 10;
//	int[] denominations = {2000,500,100};
//	int withdrawAmount;
//	String userIdValidation = "VishnuUserId";
//	String passwordValidation = "Password59";
//	Scanner sc = new Scanner(System.in);
//	void AtmLogicMethodAuthentication() {
//		System.out.println("Please enter the UserId for Authentication: ");
//		String userId_Valid = sc.next();
//		System.out.println("Please enter the Password for Authentication: ");
//		String password_Valid = sc.next();
//		if(userId_Valid.equals(userIdValidation)&& password_Valid.equals(passwordValidation)) {
//			amountMethod();
//		}
//		else {
//			System.out.println("Please Enter the Valid UserId and Password: ");
//			AtmLogicMethodAuthentication();
//		}
//	}
//	
//	void amountMethod() {
//		System.out.println("Please Enter the Amount for Withdrawal: ");
//		 withdrawAmount = sc.nextInt();
//		 if(withdrawAmount % 100 == 0) {
//			 amountDispencer();
//			}
//		 else if((withdrawAmount<100)) {
//			 System.out.println("Please Enter the Amount in the Denominations of '100': ");
//				amountMethod();
//		}
//		
//		else {
//			System.out.println("Please Enter the Amount in the Denominations of '100': ");
//			amountMethod();
//		}
//	}
//	
//	void amountDispencer() {
//		int remainingAmount = withdrawAmount;
//		System.out.println("Dispensing the Amount: ");
//		for(int denomination : denominations) {
//			if(remainingAmount >= denomination) {
//				int count = remainingAmount / denomination;
//				System.out.println(count+" x "+denomination+" Note");
//				remainingAmount %= denomination;
//			}
//		}
//		if(remainingAmount > 0) {
//			System.out.println(remainingAmount + " x 100 Note");
//		}
//		choiceChecker();
//		
//	}
//	void choiceChecker() {
//		System.out.println("Enter '1' if you wish to Continue or enter '0' to exit!");
//		int continueExitChoice = sc.nextInt();
//		if(continueExitChoice == 1) {
//			AtmLogicMethodAuthentication();
//		}
//		else if(continueExitChoice == 0) {
//			System.out.println("You have Successfully Exited!");
//		}
//		else {
//			System.out.println("Please Enter one of the two provided choices!");
//			choiceChecker();
//		}
//	}
//	
//}
