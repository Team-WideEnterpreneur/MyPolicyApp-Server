package com.dataproject.mydata.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="application")
@Getter
@Setter
public class ApplicationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long applyId;

    @Column
    private long userId;

    @Column
    private long poliId;

    @Column
    private String poliName;

    @Column
    private String state;
}
