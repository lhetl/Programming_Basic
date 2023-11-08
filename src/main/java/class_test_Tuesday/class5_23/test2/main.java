package class_test_Tuesday.class5_23.test2;

public class main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(0);
        account.deposit(10000);
        System.out.println("잔액 : " + account.getBalance());

        account.withdraw(8000);
        account.withdraw(3000);
        System.out.print("잔액 : " + account.getBalance());
    }

}
