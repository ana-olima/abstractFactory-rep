package abstractFactory;

import certificate.BrazilianCertificate;
import certificate.Certificate;
import packing.BrazilianPacking;
import packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory{

    @Override
    public Certificate getCertificate() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}