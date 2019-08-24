package aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService service = context.getBean(AwareService.class);
        service.output();

        context.close();
    }
}
