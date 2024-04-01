package com.jml1024;

import com.alibaba.fastjson2.JSON;

import java.util.HashMap;
import java.util.Map;

public class JsonTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("test", "helloworld");
        String s = JSON.toJSONString(map);
        System.out.println(s);
    }
}
