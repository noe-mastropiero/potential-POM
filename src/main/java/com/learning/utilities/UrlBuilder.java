package com.learning.utilities;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;
import java.util.Queue;

public class UrlBuilder {
    private final String hostname = "https://api-m.sandbox.paypal.com";

    public String builder (Queue <String> requestPath, Map<String,String> urlParams){
        String url = requestPathToUrl(requestPath);
        return getUrl(url,urlParams);
    }

    public String requestPathToUrl(Queue<String> requestPath){
        StringBuilder stringBuilder = new StringBuilder(hostname);
        requestPath.forEach(pathVar-> {
            stringBuilder.append("/");
            stringBuilder.append(pathVar);
        });
        return stringBuilder.toString();
    }

    private String getUrl(String url, Map<String, String> urlParams){
        if(urlParams == null || urlParams.isEmpty()){
            return url;
        }else{
            MultiValueMap <String,String> queryParams = new LinkedMultiValueMap<>();
            queryParams.setAll(urlParams);
            return UriComponentsBuilder.fromHttpUrl(url).queryParams(queryParams).build().toString();
        }
    }

}
