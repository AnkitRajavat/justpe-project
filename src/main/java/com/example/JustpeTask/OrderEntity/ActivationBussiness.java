package com.example.JustpeTask.OrderEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.service.spi.InjectService;
@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ActivationBussiness {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long phone_number;
    private String email;
    private String Bussiness_type;

}
