package schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduleTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //每隔固定时间执行
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每个间隔5秒执行一次：" + dateFormat.format(new Date()));
    }

    //Unix类系统的时间表示，例子为每天11：28执行。
    @Scheduled(cron = "0 34 22 ? * *")
    public void fixTimeExecution(){
        System.out.println("指定时间："+ dateFormat.format(new Date()) +"执行");
    }


}
