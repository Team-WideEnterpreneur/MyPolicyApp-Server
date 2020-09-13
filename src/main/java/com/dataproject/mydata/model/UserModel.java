package com.dataproject.mydata.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long userId;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String name;

    @Column(columnDefinition = "varchar(255) default '0'")
    private int age;

    //성별
    @Column(columnDefinition = "varchar(255) default '0'")
    private String gender;

    //주소지
    @Column(columnDefinition = "varchar(255) default '0'")
    private String address;

    //직장 재직 여부
    @Column(columnDefinition = "varchar(255) default '0'")
    private String wrkStat;

    //소득분위
    @Column(columnDefinition = "varchar(255) default '0'")
    private String usrStat;

    //건강보험료
    @Column(columnDefinition = "varchar(255) default '0'")
    private String hlthInsu;

    //소득
    @Column(columnDefinition = "varchar(255) default '0'")
    private String income;

    //다자녀, 기초&차상위 여부
    @Column(columnDefinition = "varchar(255) default '0'")
    private String perStat;

    //성적
    @Column(columnDefinition = "varchar(255) default '0'")
    private String grade;

    //이수학점
    @Column(columnDefinition = "varchar(255) default '0'")
    private String credit;
}
