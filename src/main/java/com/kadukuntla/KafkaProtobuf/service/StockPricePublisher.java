package com.kadukuntla.KafkaProtobuf.service;

import com.kadukuntla.KafkaProtobuf.constants.AppConstants;
import com.kadukuntla.KafkaProtobuf.dto.StockPriceDto;
import com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StockPricePublisher {

    @Autowired
    KafkaTemplate<String, StockPriceOuterClass.StockPrice> kafkaTemplate;

    public void update(StockPriceDto stockPriceDto) {
        StockPriceOuterClass.StockPrice stockPrice = StockPriceOuterClass.StockPrice.newBuilder()
                .setName(stockPriceDto.getName())
                .setLastPrice(stockPriceDto.getPrice())
                .setInstrumentToken(stockPriceDto.getInstrumentToken())
                .build();
        kafkaTemplate.send(AppConstants.STOCK_PRICE, stockPrice);
    }


}
