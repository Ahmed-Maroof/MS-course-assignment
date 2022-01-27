package com.ofa.feedbackMS.model;

public class Feedback {

    private int id;
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Feedback(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }
}
