package abstractFactory;

import certificate.Certificate;
import certificate.USCertificate;
import packing.Packing;
import packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory{


    @Override
    public Certificate getCertificate() {

        return new USCertificate();
    }

    @Override
    public Packing getPacking() {

        return new USPacking();
    }
}
