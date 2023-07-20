package abstractFactory;

import certificate.Certificate;
import packing.Packing;

public interface CountryRulesAbstractFactory {

    Certificate getCertificate();
    Packing getPacking();
}
