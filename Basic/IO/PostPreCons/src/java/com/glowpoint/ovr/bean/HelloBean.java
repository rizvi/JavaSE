/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glowpoint.ovr.bean;

import java.util.Timer;
import java.util.TimerTask;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Masudul Haque
 */
@ManagedBean
@SessionScoped
public class HelloBean {

    /**
     * Creates a new instance of HelloBean
     */
    private String name = "Masud";

    @PostConstruct
    public void initialize() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        request.getSession().setAttribute("login", "Masud");
        clockTimer = new Timer(true);
        clockTimer.schedule(clockRenderTask, 1000, 1000);

        System.out.println("Initialize");
    }

    public HelloBean() {
        System.out.println("Constructor");
    }
    private Timer clockTimer = null;
    private TimerTask clockRenderTask = new TimerTask() {
        public void run() {
            System.out.println("Rendering......................");
        }
    };

    @PreDestroy
    public void finish() {
        System.out.println("Destroy");
        if(clockTimer!=null){
            clockTimer.cancel();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
