package kz.test.step2;

import java.util.Collection;
import java.util.Map;

/**
 * Created by yevgeniya.zuyeva on 26.05.2017.
 */
public class OneManBandMap implements Performer {
    private Map<String,Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public OneManBandMap() {
    }

    @Override
    public void perform() throws PerformanceException {
        for(String key: instruments.keySet()){
            System.out.print(key+" : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }

    }
}