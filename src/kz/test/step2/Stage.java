package kz.test.step2;

/**
 * Created by yevgeniya.zuyeva on 25.05.2017.
 */
public class Stage {
    private Stage(){}

    private static class StageSingletonHolder{
        static  Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return  StageSingletonHolder.instance;
    }
}
