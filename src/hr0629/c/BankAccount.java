package hr0629.c;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance +=amount;
            System.out.println(amount+"원 입금되었습니다. 현재 잔액:"+balance);
        }
        else{
            System.out.println("유효하지 않은 금액입니다. 현재 잔액:"+balance);
        }
    }

    //public 매서드 : withdraw
    public void withdraw(int amount){
        if(isAccountValid(amount)){
            balance-=amount;
            System.out.println(amount+"원 출금되었습니다. 현재 잔액:"+balance);
        }
        else{
            System.out.println("잔액이 부족합니다. 현재 잔액:"+balance);
        }
    }

    //입금 금액이 -처럼 이상하게 들어오는 경우 방지책 검증로직 왜if로안하냐
    private boolean isAmountValid(int amount){
        return amount > 0;
    }

    private boolean isAccountValid(int amount){
        return balance >= amount;
    }
}
