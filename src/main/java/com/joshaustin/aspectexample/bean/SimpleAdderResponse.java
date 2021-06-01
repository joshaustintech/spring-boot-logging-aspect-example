package com.joshaustin.aspectexample.bean;

public class SimpleAdderResponse {

    private Integer sum;

    public SimpleAdderResponse(Integer sum) {
        this.sum = sum;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
