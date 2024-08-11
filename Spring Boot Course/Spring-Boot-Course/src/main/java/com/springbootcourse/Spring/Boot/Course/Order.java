package com.springbootcourse.Spring.Boot.Course;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {


    // When use the @JsonProperty can customize json attribute name
    //@JsonProperty("product-name")
    private String productName;
    private String customerName;
    private int quntity;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", quntity=" + quntity +
                '}';
    }
}
