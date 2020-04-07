package com.company;

public class LimitException extends  Exception {


    public LimitException() {
    }

    public LimitException(String message,double remainingAmount) {
        super( message );


    }



    public void getRemainingAmount () {

    }


}
