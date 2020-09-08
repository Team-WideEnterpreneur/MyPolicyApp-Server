package com.dataproject.mydata.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="user")
@Getter
@Setter
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long userId;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String name;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String birthDate;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String gender;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String address;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String wrkStat;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String usrStat;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String hlthInsu;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String income;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String isMoTh;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String isLowIn;

}
