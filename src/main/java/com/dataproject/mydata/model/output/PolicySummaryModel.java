package com.dataproject.mydata.model.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PolicySummaryModel {
    private long poliId;
    private String poliName;
    private String busiType;
}
