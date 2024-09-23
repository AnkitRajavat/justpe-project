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
    private String phoneNumber;
    private String email;

    @Column(name="bussinessType", nullable = false)
    private String bussinessType;
  private String tradeLicense;
    private String partnershipDeed;
    private String partnerAadhaar;
    private String partnerPanCard;
    private String  coi;
    private String authSign;
    private String aadhaar;
    private String panCard;
    private String declarationLetter;
    private String bankDocument;
    private String shopPhoto;
    private String nonSignBoardDeclarationLetter;
    private String gstDeclarationLetter;


}
