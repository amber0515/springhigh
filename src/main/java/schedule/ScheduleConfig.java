package schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("schedule")
//开启对计划任务的支持
@EnableScheduling
public class ScheduleConfig {
}
