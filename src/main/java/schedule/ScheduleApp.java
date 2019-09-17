package schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScheduleApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScheduleConfig.class);
    }
}
