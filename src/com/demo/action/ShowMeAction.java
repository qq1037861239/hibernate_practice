package com.demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class ShowMeAction extends ActionSupport {

    public String execute() {
        System.out.println("Now, you can see the struts2 ! ");
        return "ok";
    }
}
