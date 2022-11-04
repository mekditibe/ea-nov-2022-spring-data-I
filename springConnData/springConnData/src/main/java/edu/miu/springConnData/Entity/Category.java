package edu.miu.springConnData.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;

    //@JsonBackReference
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<Product> products;
}
