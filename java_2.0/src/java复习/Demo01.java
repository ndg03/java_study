package java复习;

import java.util.Scanner;

class BankAccount{
    private int balance;
    public BankAccount(){
        balance = 0 ;
    }
    public BankAccount(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount){//取款
        if(amount >= 0 && amount <= balance){
            balance = balance - amount;
        }
    }
    public void deposit(int amount){//存款
        if(amount >=0 ){
            balance = balance + amount;
        }
    }
}
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(sc.nextInt());
        int n = sc.nextInt();//表示操作次数
        int i = 0 ;
        int t = 0;
        int amount = 0;
        while(i < n){
            t = sc.nextInt();
            amount = sc.nextInt();
            if(t == 1){
                bankAccount.deposit(amount);
            }else if(t == 2){
                bankAccount.withdraw(amount);
            }
            System.out.println(bankAccount.getBalance());
        }
    }
}
