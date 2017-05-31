package kz.test.step3;

import kz.test.step2.PerformanceException;
import kz.test.step2.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Monk on 31.05.2017.
 */
public class Step3Starter {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("step3.xml");
        Performer instrumentalist = (Performer) ctx.getBean("kenny");
        instrumentalist.perform();
        System.out.println("--------------------------");
        Performer instrumentalist2 = (Performer) ctx.getBean("david");
        instrumentalist2.perform();
        System.out.println("--------------------------");
        Performer instrumentalist3 = (Performer) ctx.getBean("frank");
        instrumentalist3.perform();
        System.out.println("--------------------------");
        Performer performer = (Performer) ctx.getBean("taylor");
        performer.perform();
        System.out.println("--------------------------");
        Performer performer1 = (Performer) ctx.getBean("steve");
        performer1.perform();
    }

}
