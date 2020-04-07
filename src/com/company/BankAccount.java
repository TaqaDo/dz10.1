package com.company;

public class BankAccount {
    double amount;


    public BankAccount() {
    }

    public double getAmount() {
        return amount ;

    }

    public double deposit( double sum ) {
        amount = amount + sum;
        System.out.println(" Вы пополнили счет на "+ sum);
        return sum;
    }

    public void withDraw(int sum) throws LimitException {
        if ( sum > amount ) {
            throw new LimitException(" НЕдостаточно средств ", getAmount ());}

        amount = amount - sum;

        System.out.println(" снять сумму " + sum );




    }
}

