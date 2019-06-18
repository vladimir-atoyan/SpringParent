package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class MenuAction extends ActionSupport {
    public String tiger() {
        return "tiger";
    }

    public String lion() {
        return "lion";
    }
}