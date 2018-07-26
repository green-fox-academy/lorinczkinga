package com.greenfoxacademy.restbasics.models;

public class SumMultiply {
    private int result;

    public SumMultiply sum(int[] numbers) {
        this.result = 0;
        for (int i = 0; i < numbers.length; i++) {
            this.result += numbers[i];
        }
        return this;
    }

    public SumMultiply multiply(int[] numbers) {
        this.result = 1;
        for (int i = 0; i < numbers.length; i++) {
            this.result *= numbers[i];
        }
        return this;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
