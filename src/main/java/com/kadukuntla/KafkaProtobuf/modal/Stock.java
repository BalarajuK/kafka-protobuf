package com.kadukuntla.KafkaProtobuf.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Stock {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    @ManyToOne
    private Exchange exchange;
    private String instrumentToken;
    private String sector;
}
