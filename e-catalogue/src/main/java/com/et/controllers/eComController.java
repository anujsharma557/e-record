package com.et.controllers;

import com.et.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Anuj Sharma
 */
@RestController
public class eComController {
    /**
     * method returns product Id
     * @return
     */
    @RequestMapping("/addProduct")
    public long addProduct(){
        return 100L;
    }

    /**
     * method returns product Id
     * @return
     */
    @RequestMapping("/updateProduct")
    public long updateProduct(){
        return 100L;
    }

    /**
     * method returns product Details
     * @return
     */
    @RequestMapping("/getProduct")
    public Product getProduct(){
        return null;
    }
}
