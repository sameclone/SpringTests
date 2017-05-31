package kz.test.step2;

import java.util.Collection;
import java.util.Properties;

/**
 * Created by yevgeniya.zuyeva on 26.05.2017.
 */
public class OneBandManProperties implements Performer {


    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

    public OneBandManProperties() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (Object key : instruments.keySet()) {
            System.out.print(key + " : " + instruments.get(key));

        }

    }
}

