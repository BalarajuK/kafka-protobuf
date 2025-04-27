package com.kadukuntla.KafkaProtobuf.modal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OHLC {
    private double open;
    private double close;
    private double low;
    private double high;
}
