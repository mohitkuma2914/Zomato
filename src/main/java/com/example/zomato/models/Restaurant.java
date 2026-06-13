package com.example.zomato.models;


import com.example.zomato.models.enums.ResturantTypes;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
    private ResturantTypes resturantTypes;
    private long contactNo;
    @OneToOne(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private Menu menu;


}
