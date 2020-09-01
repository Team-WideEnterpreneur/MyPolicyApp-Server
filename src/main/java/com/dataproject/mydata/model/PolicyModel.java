package com.dataproject.mydata.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table
@Getter
@Setter
public class PolicyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String polyId;

    @Column
    private String polySriNum;

    @Column
    private String polyOrg;

    @Column
    private String polyName;

    @Column
    private String polyItcn;

    @Column
    private String polyType;

    @Column
    private String sporScl;

    @Column
    private String sporCont;

    @Column
    private String parAge;

    @Column
    private String parEmp;

    @Column
    private String parMaj;

    @Column
    private String parSpec;

}
