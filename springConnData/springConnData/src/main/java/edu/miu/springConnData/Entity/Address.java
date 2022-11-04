package edu.miu.springConnData.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String street;
    private String zip;
    private String city;

////    @JsonBackReference
    @OneToOne(mappedBy = "address",cascade = CascadeType.MERGE)
    private User user;


}
