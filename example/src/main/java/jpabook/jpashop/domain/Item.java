package jpabook.jpashop.domain;


import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Item {
    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private long id;

    private String name;
    private Integer price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categoryList = new ArrayList<>();
}
