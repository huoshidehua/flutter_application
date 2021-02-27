package com.ccq.dataprovider.brushQuestions.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ccq
 * @Date: 2021-02-25 16:39
 * @Version v1.0.0
 */
public class Question {
    private String text;
    private String solution;
    private Boolean isLocked;
    private List<Option> options = new ArrayList<>();


    public Question(String text, String solution, Boolean isLocked) {
        this.text = text;
        this.solution = solution;
        this.isLocked = isLocked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
