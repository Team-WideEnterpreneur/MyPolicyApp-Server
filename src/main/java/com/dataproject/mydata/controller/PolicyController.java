package com.dataproject.mydata.controller;

import com.dataproject.mydata.model.InputPolicyModel;

import com.dataproject.mydata.model.PolicyModel;
import com.dataproject.mydata.model.output.PolicySummaryModel;
import com.dataproject.mydata.service.PolicyService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Slf4j
@RestController
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    @GetMapping("/api")
    public void apiTest() {
        CloseableHttpClient httpClient =
                HttpClients.custom()
                        .setSSLHostnameVerifier(new NoopHostnameVerifier())
                        .build();
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setHttpClient(httpClient);
        factory.setConnectTimeout(5000);
        factory.setReadTimeout(5000);
        RestTemplate restTemplate = new RestTemplate(factory);

        HttpHeaders header = new HttpHeaders();
        HttpEntity<?> entity = new HttpEntity<>(header);

        String url="http://openapi.work.go.kr/opi/opi/opia/jynEmpSptListAPI.do";
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(url+"?"+"authKey=WNKEI278UE9EZ3COX0MPY2VR1HJ&returnType=xml&busiTpcd=PLCYTP01&chargerClcd=G&startPage=1&display=20").build();

        InputPolicyModel obj=restTemplate.getForObject(uri.toString(),InputPolicyModel.class);
        System.out.println("ok");
    }

    @GetMapping("/policy/{id}")
    public PolicyModel getPolicy(@PathVariable long id){
        log.debug("get policy id={}",id);
        return policyService.getPolicy(id);
    }

    @GetMapping("/policy/all")
    public List<PolicySummaryModel> getAllPolicy(){
        log.debug("get all policy name");
        return policyService.getAllPolicySummary();
    }

    @PostMapping("/policy")
    public String createPolicy(@RequestBody PolicyModel policyModel){
        policyService.createPolicy(policyModel);
        return "ok";
    }
}
