package com.ivoyant.training;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the two number");
        int a = s.nextInt();
        int b = s.nextInt();
        while (true) {
            System.out.println("select Operation");
            System.out.println("1.add\t2.Sub\t3.Mul\t4.Div\t5.Rem");
            System.out.println("enter your choice");
            int ch = s.nextInt();
            Calc c = new Calc(a, b);


            switch (ch) {
                case 1:
                    System.out.println("Addition Operation");
                    System.out.println(c.getA() + c.getB());
                    break;
                case 2:
                    System.out.println("Subtraction Operation");
                    System.out.println(c.getA() - c.getB());
                    break;
                case 3:
                    System.out.println("Multiplication");
                    System.out.println(c.getA() * c.getB());
                    break;
                case 4:
                    System.out.println("Division");
                    System.out.println(c.getA() / c.getB());
                    break;
                case 5:
                    System.out.println("Reminder");
                    System.out.println(c.getA() % c.getB());
                    break;
                default:
                    System.out.println("please choice above mentioned");
            }
            System.out.println("do you want to continue click 1 or stop click 0");
            int p=s.nextInt();
            if(p==0){
                break;
            }
    }
}
}
