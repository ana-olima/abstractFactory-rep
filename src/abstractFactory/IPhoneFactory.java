package abstractFactory;

import iphone.IPhone;

public abstract class IPhoneFactory {

    CountryRulesAbstractFactory rules;


    public IPhoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public IPhone orderIPhone(String level) {
        IPhone device = null;

        device = createIPhone(level);

        if (device != null) {
            device.getHardware();
            device.assemble();
            device.certificate();
            device.pack();
        }
        return device;
    }
    protected abstract IPhone createIPhone(String level);
}
