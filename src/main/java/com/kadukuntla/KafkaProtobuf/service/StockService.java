package com.kadukuntla.KafkaProtobuf.service;

import com.kadukuntla.KafkaProtobuf.modal.StockPrice;
import com.kadukuntla.KafkaProtobuf.repository.StockPriceMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    private StockPriceMongoRepository repository;

    @Autowired
    StockService(StockPriceMongoRepository repository){
        this.repository = repository;
    }

    public List<StockPrice> getStocks() {
        return repository.getAllStocks();
    }



}
