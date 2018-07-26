package com.greenfoxacademy.restbasics.models;

public class DoUntil {
    private Integer result;

    public DoUntil doUntil(String what, Until until) {
        if (what.equals("sum")) {
            this.result = 0;
            for (int i = 1; i <= until.getUntil(); i++) {
                this.result += i;
            }
        }
        if (what.equals("factor")) {
            this.result = 1;
            for (int j = 1; j <= until.getUntil(); j++) {
                this.result *= j;
            }
        }
        return this;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}