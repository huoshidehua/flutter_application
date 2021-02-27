package com.ccq.dataprovider.brushQuestions.vo;

/**
 * @Author: ccq
 * @Date: 2021-02-25 16:41
 * @Version v1.0.0
 */
public class Option {
    private String code;
    private String text;
    private Boolean isCorrect;

    public Option(String code, String text, Boolean isCorrect) {
        this.code = code;
        this.text = text;
        this.isCorrect = isCorrect;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }
}
