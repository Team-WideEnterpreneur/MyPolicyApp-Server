package com.dataproject.mydata.model;

import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name="jynEmpSptRoot")
public class InputPolicyModel {
    private List<Policy> policys;

    public List<Policy> getPolicys(){
        return policys;
    }

    public void setPolicy(Policy policy){
        policys.add(policy);
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @XmlRootElement(name="jynEmpSptList")
    public static class Policy{
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
}
