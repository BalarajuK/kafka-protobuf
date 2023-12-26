package com.kadukuntla.KafkaProtobuf.kafka;

import com.google.protobuf.InvalidProtocolBufferException;
import com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass;
import org.apache.kafka.common.serialization.Deserializer;


public class CallbackDeserializer implements Deserializer<StockPriceOuterClass.StockPrice> {

    @Override
    public StockPriceOuterClass.StockPrice deserialize(final String topic, byte[] data) {
        try {
            return StockPriceOuterClass.StockPrice.parseFrom(data);
        } catch (InvalidProtocolBufferException e) {
            System.out.println("Problem in parsing");
            return null;
        }
    }
}