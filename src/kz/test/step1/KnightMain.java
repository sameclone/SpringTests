package kz.test.step1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yevgeniya.zuyeva on 25.05.2017.
 */
public class KnightMain {
    public static void main(String[] args) throws QuestException {
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = (Knight)context.getBean("knight");
        knight.embarkOnQuest();

    }
}
