package com.xiaoxin.starter;


import com.alibaba.fastjson.JSON;
import com.xiaoxin.starter.autoconfiguration.HelloProperties;

public class HelloFormatTemplate {

    private HelloProperties helloProperties;

    public HelloFormatTemplate(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public <T> String doFormat() {
        return JSON.toJSONString(helloProperties.getInfo());
    }
}
