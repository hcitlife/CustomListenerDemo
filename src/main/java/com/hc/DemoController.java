package com.hc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/fun")
    public void fun(){
        System.out.println("fun");
    }
}
