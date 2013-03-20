/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.quartz.example;

import java.util.ArrayList;
import java.util.Date;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author Masudul Haque
 */
public class DumbJob implements Job {

    public DumbJob() {
    }

    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        String instName = context.getJobDetail().getName();
        String instGroup = context.getJobDetail().getGroup();

        JobDataMap dataMap = context.getMergedJobDataMap();  // Note the difference from the previous example

        String jobSays = dataMap.getString("jobSays");
        float myFloatValue = dataMap.getFloat("myFloatValue");
        ArrayList state = (ArrayList) dataMap.get("myStateData");
        state.add(new Date());

        System.err.println("Instance " + instName + " of DumbJob says: " + jobSays);
    }
}
