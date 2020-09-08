package com.dataproject.mydata.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name="policy")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PolicyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long poliId;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String poliName;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String busiType;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String wrkStat;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String grade;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String credit;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String tenure;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String wrkScl;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String usrStat;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String minAge;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String maxAge;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String startDay;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String endDay;

    //@Column(columnDefinition = "varchar(255) default '0'")
    //private String incomQui;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String poliUrl;

}
