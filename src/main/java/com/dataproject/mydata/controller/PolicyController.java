package com.dataproject.mydata.controller;

import com.dataproject.mydata.model.InputPolicyModel;

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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

@RestController
public class PolicyController {

    public HttpClient getHttpClient() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sslContext = SSLContexts.custom().build();
        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext,
                new String[]{"TLSv1.3", "TLSv1.2", "TLSv1.1"}, null, SSLConnectionSocketFactory.getDefaultHostnameVerifier());
        return HttpClients.custom()
                .setSSLSocketFactory(sslConnectionSocketFactory)
                .build();
    }

    @GetMapping("/apitest")
    public void apiTest() {
        //TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
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
        //ResponseEntity<InputPolicyModel> obj = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, InputPolicyModel.class);
        //InputTestModel obj=restTemplate.getForObject(uri.toString(),InputTestModel.class);
        System.out.println("ok");
    }

}
