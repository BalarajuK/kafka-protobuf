package com.kadukuntla.KafkaProtobuf.kafka;

import com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass;
import org.apache.kafka.common.serialization.Serializer;

public class CallbackSerializer implements Serializer<StockPriceOuterClass.StockPrice> {

    @Override
    public byte[] serialize(String s, StockPriceOuterClass.StockPrice stockPrice) {
        return stockPrice.toByteArray();
    }
}
