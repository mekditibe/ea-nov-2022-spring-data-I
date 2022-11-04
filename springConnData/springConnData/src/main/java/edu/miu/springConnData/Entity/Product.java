package edu.miu.springConnData.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private Double price;
    private Double rating;

    //@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "category_Id")
    private Category category;

    //@JsonManagedReference
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private List<Review> review;


}
