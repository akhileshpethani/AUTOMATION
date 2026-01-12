package Assignment_6;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    int amountNeeded;

    InsufficientBalanceException(int amountNeeded) {
        this.amountNeeded = amountNeeded;
    }

    @Override
    public String getMessage() {
        return "Sorry, insufficient balance, you need more " + amountNeeded + " Rs. to perform this transaction.";
    }
}

public class P026_WarningMessage {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int accountBalance = 2000;

	        System.out.println("Account balance is: " + accountBalance);
	        System.out.print("Enter withdraw amount: ");
	        int withdrawAmount = sc.nextInt();

	        try {
	            if (withdrawAmount > accountBalance) {
	                // Throw custom exception if balance is insufficient
	                throw new InsufficientBalanceException(withdrawAmount - accountBalance);
	            } else {
	                accountBalance -= withdrawAmount;
	                System.out.println("Transaction successful! Remaining balance: " + accountBalance);
	            }
	        } catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }

	        sc.close();
	    }

}
