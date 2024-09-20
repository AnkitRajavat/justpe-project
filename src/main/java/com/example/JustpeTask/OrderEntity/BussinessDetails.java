package com.example.JustpeTask.OrderEntity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.processing.Pattern;

@Entity
@Table(name="bussiness_Details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BussinessDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Product;
    @NonNull
    private long price;
    @NonNull
    @Column(nullable = false)
    private String bussiness_type;
    private String name;
    @Size(min = 10, max = 10, message = "Phone number must be exactly 10 digits")
    private String phone_number;
    @Size(min = 10, max = 10, message = "Phone number must be exactly 10 digits")
    private String Alternet_phonenumber;
    private String email;
    private String delivery_Address;
    private long pin_number;
    private String city;
    private String state;


}
