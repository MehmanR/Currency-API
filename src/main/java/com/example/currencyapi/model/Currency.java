package com.example.currencyapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "currency_code",unique = true,nullable = false)
    private String currencyCode;

    @Column(name = "currency_name",unique = true,nullable = false)
    private String currencyName;


//    private Double exchangeRate;

}


