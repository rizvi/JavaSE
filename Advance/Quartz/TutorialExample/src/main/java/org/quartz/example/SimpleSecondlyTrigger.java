/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.quartz.example;

import java.util.Date;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerUtils;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author Masudul Haque
 */
public class SimpleSecondlyTrigger {

    public static void main(String[] args) throws SchedulerException {
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();
        sched.start();

        JobDetail jobDetail = new JobDetail("myJob",
                null,
//                HelloJob.class);
                DumbJob.class);

//        Trigger trigger = TriggerUtils.makeHourlyTrigger(); // fire every hour
        Trigger trigger = TriggerUtils.makeSecondlyTrigger(); // fire every hour
        trigger.setStartTime(TriggerUtils.getEvenSecondDate(new Date()));  // start on the next even hour
        trigger.setName("myTrigger");

        sched.scheduleJob(jobDetail, trigger);
    }
}
