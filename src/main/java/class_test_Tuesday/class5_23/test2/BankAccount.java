package class_test_Tuesday.class5_23.test2;

import java.awt.font.TextHitInfo;

public class BankAccount {
    private int accountNumber;
    private String owner;
    private int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int balance){
        this.balance+=balance;
    }

    public void withdraw(int balance){
        if(this.balance-balance>=0) this.balance-=balance;
        else{
            int balance2=this.balance;
            this.balance=0;
            System.out.println(balance+"만큼의 금액을 출금할 수 없음으로\n"+balance2+"만큼의의 금액만 출금하였습니다");
        }
    }
}
