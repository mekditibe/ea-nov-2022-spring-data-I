package edu.miu.springConnData.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Id;

import java.util.List;

@Entity
@Data
@Table(name = "User_Table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastname;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Review> reviews;

    //    @JsonManagedReference
    @OneToOne
    private Address address;

}
