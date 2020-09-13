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

    //사업규모
    @Column(columnDefinition = "varchar(255) default '0'")
    private String busiType;

    //재학&재직 상태
    @Column(columnDefinition = "varchar(255) default '0'")
    private String wrkStat;

    //성적
    @Column(columnDefinition = "varchar(255) default '0'")
    private String grade;

    //학점
    @Column(columnDefinition = "varchar(255) default '0'")
    private String credit;

    //재직기업 규모
    @Column(columnDefinition = "varchar(255) default '0'")
    private String wrkScl;

    //재직기간 min
    @Column(columnDefinition = "varchar(255) default '0'")
    private String wrkPeMin;

    //재직기간 max
    @Column(columnDefinition = "varchar(255) default '0'")
    private String wrkPeMax;

    //다자녀, 기초&차상위 여부
    @Column(columnDefinition = "varchar(255) default '0'")
    private String perStat;

    //신고소득
    @Column(columnDefinition = "varchar(255) default '0'")
    private String income;

    //주택 소유 여부
    @Column(columnDefinition = "varchar(255) default '0'")
    private String isHvHm;

    //소득분위
    @Column(columnDefinition = "varchar(255) default '0'")
    private String usrStat;

    //가구소득 기준 중위소득1
    @Column(columnDefinition = "varchar(255) default '0'")
    private String usrMid1;

    //가구소득 기준 중위소득2
    @Column(columnDefinition = "varchar(255) default '0'")
    private String usrMid2;

    @Column(columnDefinition = "varchar(255) default '0'")
    private int minAge;

    @Column(columnDefinition = "varchar(255) default '0'")
    private int maxAge;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String startDay;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String endDay;

    @Column(columnDefinition = "varchar(255) default '0'")
    private String poliUrl;

}
