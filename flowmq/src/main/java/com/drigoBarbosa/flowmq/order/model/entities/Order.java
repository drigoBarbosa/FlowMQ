package com.drigoBarbosa.flowmq.order.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    UUID id;
    String name;
    String code;


}
