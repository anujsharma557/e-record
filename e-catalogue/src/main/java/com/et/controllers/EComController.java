package com.et.controllers;

import com.et.model.Product;
import com.et.utility.ConnectionUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;

/**
 * @author: Anuj Sharma
 */
@RestController
public class EComController {
    private static final Logger log= LoggerFactory.getLogger(EComController.class);
    /**
     * method returns product Id
     * @return
     */
    @RequestMapping("/addProduct")
    public long addProduct(@RequestParam long productId, @RequestParam String productType,@RequestParam String productBrand,@RequestParam float mrp,@RequestParam String discount){
        String res="getProduct call-"+productId+":"+productType+":"+productBrand+":"+mrp+":"+discount;

        return productId;
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

    /**
     * method returns product Details
     * @return
     */
    @RequestMapping("/registerSeller")
    public void registerSeller(@RequestParam String firstName, @RequestParam String middleName,@RequestParam String lastName,
                                  @RequestParam String phone,@RequestParam String email, @RequestParam String password){
        String res="registerSeller call-"+firstName+":"+middleName+":"+lastName+":"+phone+":"+email+":"+password;
        System.out.println(res);

    }
}
