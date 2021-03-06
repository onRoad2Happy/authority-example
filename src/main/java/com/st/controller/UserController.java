package com.st.controller;

import com.st.common.Authority;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {


    // 这个是为了测试没有注解时，是否会拦截
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public Map login() {
        Map<String, String> map = new HashMap<>();
        map.put("msg", "login success");
        return map;
    }

    @Authority()
    @RequestMapping(value = "queryAllProduct", method = RequestMethod.GET)
    public Map queryAllProduct() {
        Map<String, String> map = new HashMap<>();
        map.put("msg", "this is all data");
        return map;
    }
}
