计划任务在 spring 中的实现

目前计划任务只发现靠时间执行函数。

1、在Service中，使用@Schedule来规定执行计划。
2、config类上@EnableScheduling，使spring提供对计划任务的支持。