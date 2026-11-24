class Account {
    int accountNumber;

    void showAccount() {
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    void showSavingsDetails() {
        System.out.println("Interest Rate: " + interestRate);
    }
}

class FixedDepositAccount extends SavingsAccount {
    int lockInYears;

    void showFDDetails() {
        System.out.println("Lock-in Years: " + lockInYears);
    }
}

public class homework_array1 {
    public static void main(String[] args) {
        FixedDepositAccount account = new FixedDepositAccount();
        account.accountNumber = 12345;
        account.interestRate = 7.5;
        account.lockInYears = 5;

        account.showAccount();
        account.showSavingsDetails();
        account.showFDDetails();
    }
}