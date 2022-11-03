package edu.miu.springConnData.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {

    @Id
    private Long Id;
    private String comment;

    @ManyToOne
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_Id")
    private Product product;

}
