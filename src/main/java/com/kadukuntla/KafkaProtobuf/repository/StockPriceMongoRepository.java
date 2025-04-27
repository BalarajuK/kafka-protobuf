package com.kadukuntla.KafkaProtobuf.repository;

import com.kadukuntla.KafkaProtobuf.modal.StockInstrument;
import com.kadukuntla.KafkaProtobuf.modal.StockPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.CustomConversions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StockPriceMongoRepository {


    private MongoTemplate mongoTemplate;

    @Autowired
    public StockPriceMongoRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
//        MappingMongoConverter mongoMapping = (MappingMongoConverter) mongoTemplate.getConverter();
//        mongoMapping.setCustomConversions(customConversions());
//        mongoMapping.afterPropertiesSet();
    }

    public List<StockPrice> getAllStocks(){
        return mongoTemplate.findAll(StockPrice.class);
    }

    public List<StockInstrument> getStockInstruments(){
        return mongoTemplate.findAll(StockInstrument.class);
    }

    public static CustomConversions customConversions() {
        List<Converter<?, ?>> converterList = new ArrayList<>();
        converterList.add(new MongoLocalDateTimeFromStringConverter());
        return new CustomConversions(CustomConversions.StoreConversions.NONE, converterList);
    }

    private static final class MongoLocalDateTimeFromStringConverter implements Converter<String, OffsetTime> {

        @Override
        public OffsetTime convert(String source) {
            return source == null ? null : OffsetTime.parse(source);
        }
    }


}
