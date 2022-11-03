package edu.miu.springConnData.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
@Data
public class Address {

    @Id
    private Long Id;
    private String street;
    private String zip;
    private String city;

////    @JsonBackReference
    @OneToOne(mappedBy = "address")
    private User user;


}
