package com.example.JustpeTask.OrderEntity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.processing.Pattern;
import org.springframework.stereotype.Component;

@Entity
@Table(name="bussiness_Details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class BussinessDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Product;
    @NonNull
    private long price;
    @NonNull
    @Column(name="bussinessType", nullable = false)
    private String bussinessType;

    private String name;
    @Size(min = 10, max = 10, message = "Phone number must be exactly 10 digits")
    private String phoneNumber;
    @Size(min = 10, max = 10, message = "Phone number must be exactly 10 digits")
    private String Alternet_phonenumber;
    private String email;
    private String delivery_Address;
    private long pin_number;
    private String city;
    private String state;


}
