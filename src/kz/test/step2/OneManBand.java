package kz.test.step2;

import java.util.Collection;

/**
 * Created by yevgeniya.zuyeva on 26.05.2017.
 */
public class OneManBand implements Performer {
    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        for(Instrument instrument: instruments){
            instrument.play();
        }

    }
}
