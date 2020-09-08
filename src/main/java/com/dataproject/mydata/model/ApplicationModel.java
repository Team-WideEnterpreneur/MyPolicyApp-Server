package com.dataproject.mydata.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="application")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
