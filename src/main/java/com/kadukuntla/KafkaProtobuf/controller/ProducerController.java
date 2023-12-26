package com.kadukuntla.KafkaProtobuf.controller;

import com.kadukuntla.KafkaProtobuf.dto.StockPriceDto;
import com.kadukuntla.KafkaProtobuf.service.StockPricePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
public class ProducerController {

    @Autowired
    private StockPricePublisher stockPricePublisher;

    @GetMapping
    public ResponseEntity<String> getHello(){
        return ResponseEntity.ok("Hello");
    }

    @PutMapping
    public ResponseEntity<String> updateStockPrice(@RequestBody StockPriceDto stock){
        stockPricePublisher.update(stock);
        return ResponseEntity.ok("Updated");
    }

}
