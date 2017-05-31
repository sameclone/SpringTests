package kz.test.step2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Step2Starter {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("step2.xml");

        Performer performer = (Performer)ctx.getBean("duke");
        performer.perform();

        System.out.println("--------------------------");
        Auditorium auditorium = (Auditorium)ctx.getBean("auditorium");
        auditorium.presentation();
        System.out.println("--------------------------");
        Performer instrumentalist = (Performer) ctx.getBean("kenny");
        instrumentalist.perform();
        System.out.println("--------------------------");
        Performer oneBandMan = (Performer) ctx.getBean("hank");
        oneBandMan.perform();
        System.out.println("--------------------------");
        Performer oneBandMan2 = (Performer) ctx.getBean("hank2");
        oneBandMan2.perform();
        System.out.println("--------------------------");
        Performer oneBandMan3 = (Performer) ctx.getBean("hank3");
        oneBandMan3.perform();
        System.out.println("--------------------------");
        Performer carl = (Performer) ctx.getBean("carl");
        carl.perform();
    }
}
