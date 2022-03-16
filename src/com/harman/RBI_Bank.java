package com.harman;

abstract class RBI_Bank {
    abstract void setInterestRate();


}
class SBI extends RBI_Bank{

    void setInterestRate(){System.out.println("7 %");}
}
class ICICI extends RBI_Bank {

    void setInterestRate() {System.out.println("7.5 %");}

}
class ABCD_Bank
{
    public static void main(String[] args) {
        RBI_Bank sbi_obj=new SBI();
        RBI_Bank icici_obj=new ICICI();
        sbi_obj.setInterestRate();
        System.out.println("SBI INTRESETRATE");
        icici_obj.setInterestRate();
        System.out.println("ICICI INTRESETRATE");
    }
}