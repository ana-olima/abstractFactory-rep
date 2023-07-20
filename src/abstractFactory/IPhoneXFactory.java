package abstractFactory;

import iphone.IPhone;
import iphone.IPhoneX;
import iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory{
    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    protected IPhone createIPhone(String level) {

        if (level.equals("highEnd")) {
            return new IPhoneXSMax(rules);
        } else if (level.equals("standard")) {
            return new IPhoneX(rules);
        }else return null;
        }
    }


