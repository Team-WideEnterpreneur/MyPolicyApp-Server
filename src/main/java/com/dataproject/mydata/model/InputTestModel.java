package com.dataproject.mydata.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="jynEmpSptList")
public class InputTestModel {
    private String busiId;
    private String busiNm;
    private String subBusiNm;
    private String dtlBusiNm;
    private String sptScale;
    private String busiSum;
    private String chargerOrgNm;
    private String onlineApplPossYn;
    private String applUrl;
    private String busiTpCd;
    private String detalUrl;
    private String ageEtcCont;
    private String edubgEtcCont;
    private String empEtcCont;
    private String relInfoUrl;
    private String chargerClcd;
}
