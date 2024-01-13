package com.example.sleuthbug;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}