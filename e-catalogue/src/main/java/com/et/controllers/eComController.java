package com.et.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class eComController {
    @RequestMapping("/addProduct")
    public long addProduct(){
        return 100L;
    }
}
