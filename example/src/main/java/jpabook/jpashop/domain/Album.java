package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Album extends Item{
    private String artist;
    private String etc;
}
