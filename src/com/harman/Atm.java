package com.harman;

abstract class Atm {
    abstract void checkATM_Balance();

}

class bank extends Atm{

    void checkATM_Balance()
    {
        System.out.println("INR. 24567");


    }

    public static void main(String[] args) {
        Atm myatm=new bank();
        myatm.checkATM_Balance();
    }

}
