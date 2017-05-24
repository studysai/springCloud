package com.studysai.ribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lj on 2017/5/24.
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam String a, @RequestParam String b) {
        return  restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=" + a +"&b=" + b, String.class).getBody();
    }
}
