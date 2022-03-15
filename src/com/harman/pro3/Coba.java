package com.harman.pro3;

import java.util.Scanner;

public class Coba extends Mythings {//inheritance
    public static void main(String[] args) {
        Coba co=new Coba();
        Scanner input= new Scanner(System.in);
        int x,y,addresult,subresult;
        System.out.println("Enter 1st num:");
        x= input.nextInt();
        System.out.println("Enter 2nd num");
        y=input.nextInt();
        addresult=co.Add2numbers(x,y);
        System.out.println(addresult);
        subresult=co.Sub2numbers(x,y);
        System.out.println(subresult);

    }
}
