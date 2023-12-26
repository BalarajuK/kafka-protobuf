package com.kadukuntla.KafkaProtobuf.service;

import com.kadukuntla.KafkaProtobuf.constants.AppConstants;
import com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.kadukuntla.KafkaProtobuf.constants.AppConstants.USER_GROUP;

@Service
public class StockConsumer {

    @KafkaListener(topics= AppConstants.STOCK_PRICE, groupId = USER_GROUP)
    public void stockUpdates(StockPriceOuterClass.StockPrice stockPrice){
        System.out.println("New record from Kafka");
        System.out.println("Name:"+stockPrice.getName());
        System.out.println("Last Reported Price:"+stockPrice.getLastPrice());
    }

}
