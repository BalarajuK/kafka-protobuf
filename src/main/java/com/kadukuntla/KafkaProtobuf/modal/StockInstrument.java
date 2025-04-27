package com.kadukuntla.KafkaProtobuf.modal;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@Document(collection = "instruments")
public class StockInstrument {

    @Field("instrument_token")
    private String instrumentToken;

    @Field("exchange_token")
    private String exchangeToken;

    @Field("tradingsymbol")
    private String tradingsymbol;

    @Field("name")
    private String name;

    @Field("last_price")
    private double lastPrice;

    @Field("expiry")
    private String expiry;

    @Field("strike")
    private int strike;

    @Field("tick_size")
    private int tick_size;

    @Field("lot_size")
    private int lot_size;

    @Field("instrument_type")
    private double instrumentType;


    @Field("exchange")
    private double exchange;

}
