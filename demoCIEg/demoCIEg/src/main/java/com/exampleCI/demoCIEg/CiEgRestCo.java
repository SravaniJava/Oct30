package com.exampleCI.demoCIEg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiEgRestCo {
    @GetMapping("/test")
    public String test(){
        return "hello";

    }
}
