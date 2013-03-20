/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.quartz.example;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Masudul Haque
 */
public class HelloJob implements Job{
    
    private static final Logger logger=LoggerFactory.getLogger(HelloJob.class);

    public void execute(JobExecutionContext jec) throws JobExecutionException {
//        System.out.println("Hello");
        logger.info("Hello {}","World");
    }
    
}
