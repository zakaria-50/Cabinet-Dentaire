package com.hopital.pfaspringboot.hr.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patients")

public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long id  ;
    private String nom ;
    private String prenom ;
    private Sexe gender ;

    private String birthday ;
    private String tel ;
    private String address ;
    private String city ;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image ;

    /*@DateTimeFormat(pattern = "yyyy-MM-dd")*/
    private LocalDateTime dateCreation;


}
