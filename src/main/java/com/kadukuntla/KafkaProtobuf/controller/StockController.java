package com.kadukuntla.KafkaProtobuf.controller;

import com.kadukuntla.KafkaProtobuf.dto.StockPriceDto;
import com.kadukuntla.KafkaProtobuf.modal.StockPrice;
import com.kadukuntla.KafkaProtobuf.service.StockPricePublisher;
import com.kadukuntla.KafkaProtobuf.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @Autowired
    private StockPricePublisher stockPricePublisher;

    @PostMapping("/publish")
    public ResponseEntity<String> publishStocks() {
        List<StockPrice> stockPrices = stockService.getStocks();
        int count = 0;
        for (StockPrice stock : stockPrices) {
            if (stock.getTradingSymbol() != null) {
                StockPriceDto st = new StockPriceDto();
                st.setName(stock.getTradingSymbol());
                st.setPrice(stock.getLastPrice());
                st.setInstrumentToken(stock.getInstrumentToken());
                stockPricePublisher.update(st);
                count++;
                if(count>=10){
                    break;
                }
            }
        }
        return ResponseEntity.ok("Successfully published stocks");
    }
}
