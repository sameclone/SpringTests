package kz.test.step2;

/**
 * Created by yevgeniya.zuyeva on 26.05.2017.
 */
public class Instrumentalist  implements Performer{
    private String song;
    private  int age ;
    private Instrument instrument;

    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing "+song+" : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong(){
        return song;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
