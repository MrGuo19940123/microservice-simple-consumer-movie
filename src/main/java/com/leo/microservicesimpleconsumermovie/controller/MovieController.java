package com.leo.microservicesimpleconsumermovie.controller;

import com.leo.microservicesimpleconsumermovie.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
  * @Company     一生温暖纯良 不舍爱与自由
  * @Author      郭志学
  * @Date        2018/11/28
  * @Version     1.0
  * @Description TODO 购票类
  */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://localhost:8080/"+id,User.class);
    }
}
