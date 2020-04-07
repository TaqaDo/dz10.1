package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        System.out.println(" Ваш счет " + bankAccount.getAmount());
        for (int i = 0; ; i++) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {

                System.out.println(" Сейчас Ваш счет " + bankAccount.getAmount());
                bankAccount.withDraw((int) bankAccount.getAmount());



                System.out.println(e.getMessage());
                System.out.println(" Ваш счет равен " + bankAccount.getAmount());
                break;


            }
        }


    }

}


