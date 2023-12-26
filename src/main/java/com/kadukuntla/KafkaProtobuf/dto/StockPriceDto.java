package com.kadukuntla.KafkaProtobuf.dto;


public class StockPriceDto {
    private String name;
    private String instrumentToken;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrumentToken() {
        return instrumentToken;
    }

    public void setInstrumentToken(String instrumentToken) {
        this.instrumentToken = instrumentToken;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
