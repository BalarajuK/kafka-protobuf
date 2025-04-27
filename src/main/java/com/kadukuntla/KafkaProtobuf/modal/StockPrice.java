package com.kadukuntla.KafkaProtobuf.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.OffsetTime;

@Data
@AllArgsConstructor
@Document(collection = "stock_prices")
public class StockPrice {

    @Field("instrument_token")
    private String instrumentToken;

    @Field("tradingsymbol")
    private String tradingSymbol;

    @Field("timestamp")
    private String timeStamp;

    @Field("last_price")
    private double lastPrice;

    @Field("net_change")
    private double netChange;

    @Field("ohlc")
    private OHLC ohlc;


}
