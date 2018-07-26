package com.greenfoxacademy.restbasics.models;

public class DoublingArray {
    private int[] result;

    public DoublingArray doubling(int[] numbers) {
        this.result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            this.result[i] = numbers[i] * 2;
        }
        return this;
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }
}
