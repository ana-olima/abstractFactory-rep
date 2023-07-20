package packing;

import abstractFactory.*;
import iphone.IPhone;
import iphone.IPhoneX;

public class Client {
    public static void main(String[] args) {


        CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
        IPhoneFactory genXFactory = new IPhoneXFactory(rules);
        IPhoneFactory gen11Factory = new IPhone11Factory(rules);

        System.out.println("##Ordering an IPhone X");
        IPhone iPhone = genXFactory.orderIPhone("standard");
        System.out.println(iPhone);

        System.out.println("###Ordering an IPhone 11");
        IPhone iPhone1 = gen11Factory.orderIPhone("highEnd");
        System.out.println(iPhone1);
    }
}

