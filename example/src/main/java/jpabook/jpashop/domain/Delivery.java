package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id @GeneratedValue
    private Long id;

    private String city;
    private String street;
    private String zipcode;

    @Enumerated
    private DelieryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;
}
