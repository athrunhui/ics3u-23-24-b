package lesson1;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Maya",1500.76,526374);
        BankAccount account2 = new BankAccount("Steve",13000,584732);

        /* State of account1:
         * accountHolder: "Maya"
         * accountBalance: 1500.76
         * accountNumber:526374
         * 
         * State of account2:
         * accountHolder: "Steve"
         * accountBalance: 13000
         * accountNumber: 584732
         */

        account1.deposit(1000.50);
        /* State of account1:
         * accountHolder: "Maya"
         * accountBalance: 2500.26
         * accountNumber:526374
         */

    }
}
