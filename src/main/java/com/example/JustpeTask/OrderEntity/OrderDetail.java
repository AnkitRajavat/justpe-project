package com.example.JustpeTask.OrderEntity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name="order_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cashOnDelivery;
    private int deliveryCharge ;
    private String orderStatus;
    private String message;

}
