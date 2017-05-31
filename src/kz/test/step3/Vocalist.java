package kz.test.step3;

import kz.test.step2.PerformanceException;
import kz.test.step2.Performer;

/**
 * Created by Monk on 31.05.2017.
 */
public class Vocalist implements Performer {
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Vocalist sing the song "+getSong());
    }
}
