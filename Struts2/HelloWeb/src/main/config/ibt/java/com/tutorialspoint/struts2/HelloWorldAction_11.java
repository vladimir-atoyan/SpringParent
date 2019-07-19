package com.tutorialspoint.struts2;

public class HelloWorldAction_11 {
    private String name;

    public HelloWorldAction_11() {}
    public HelloWorldAction_11(int extra) {}

    public String execute() throws Exception {
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}