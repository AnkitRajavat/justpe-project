package com.example.JustpeTask.OrderEntity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Bussines_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BussinessType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="name",nullable=true)
    private String name;
    @Column(name="price",nullable=true)
    private long price;
    @NonNull
    @Column(name="bussinessType")
    private String bussinessType;
}
