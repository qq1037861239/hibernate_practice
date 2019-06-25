package com.demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class ShowUAction extends ActionSupport {
    public String viewThat() {
        System.out.println("mimiamimi");
        return SUCCESS;
    }
}
