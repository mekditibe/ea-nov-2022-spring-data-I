package edu.miu.springConnData.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    private Long Id;
    private String name;

    //@JsonBackReference
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
