package iphone;

import abstractFactory.CountryRulesAbstractFactory;

public abstract class IPhone {
    CountryRulesAbstractFactory rules;

    public IPhone(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }
    public abstract void getHardware();

    public void assemble(){
        System.out.println("Assembling all hardwares");
    }
    public void certificate(){
    System.out.println("Testing all certificates");
    System.out.println(rules.getCertificate().applyCertification());
    }
    public void pack(){
        System.out.println("Packing the device");
        System.out.println(rules.getPacking().pack());
    }
}