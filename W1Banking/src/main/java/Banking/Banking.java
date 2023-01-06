package Banking;

import java.util.Scanner;
public class Banking {

	static int BALANCE = 1000;
	static int AFTERWITHDRAW;
	static int AFTERDEPOSIT;
	static int CHECKBALANCE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------Welcome to Wiley Bank------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = sc.nextLine();
		System.out.println("Welcome " + name);
		welcome();

	}

	static void welcome() {

		System.out.println("We Provide the following Banking Services..");
		System.out.println("1.CheckBalance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("Please do select your banking Operation");
		Scanner sc1 = new Scanner(System.in);
		int bank = sc1.nextInt();
		switch (bank) {
			case 1:
				checkBalance();
				break;
			case 2:
				System.out.println("Welcome to Deposit Screen");
				System.out.println("Please Enter amount of deposit");
				int DepositAmount = sc1.nextInt();
				deposit(BALANCE, DepositAmount);
				//flow();
				break;
			case 3:
				System.out.println("Welcome to Withdraw Screen");
				System.out.println("Please Enter amount of Withdraw");
				int WithdrawAmount = sc1.nextInt();
				withDraw(BALANCE, WithdrawAmount);
				// Flow();
				break;
			default:
				System.out.println("Please Provide correct option");
				welcome();
				break;

		}
	}

	static int deposit(int Bal, int DepoAmt) {

		System.out.println("Details of Deposit:");
		System.out.println("Your Balance = " + BALANCE);
		System.out.println("Your Deposit Amount = " + DepoAmt);
		AFTERDEPOSIT = DepoAmt + BALANCE;
		System.out.println("Total Balance After Deposit = " + AFTERDEPOSIT);
		BALANCE = AFTERDEPOSIT;
		return AFTERDEPOSIT;

	}

	static int withDraw(int bal, int wdamt) {

		if (wdamt <= 1000) {
			System.out.println("Details of Withdraw:");
			System.out.println("Your Balance = " + BALANCE);
			System.out.println("Your WithdrawAmount = " + wdamt);
			AFTERWITHDRAW = BALANCE - wdamt;
			System.out.println("Total Balance After Withdraw = " + AFTERWITHDRAW);
			//flow();
		} else {
			System.out.println("Sorry!! Your are crossing the limit of Withdraw");
		}
		return AFTERWITHDRAW;
	}

	static int checkBalance() {
		System.out.println("Welcome to CheckBalance Screen");
		CHECKBALANCE = BALANCE;
		System.out.println("Your Balance = " + CHECKBALANCE);
		//flow();
		return CHECKBALANCE;
	}

	static void goodBye() {
		System.out.println("Thank you For Choosing Wiley Banking Services");
	}


}
