package com.et.controllers;

import com.et.model.ProductDetail;
import com.et.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: Anuj Sharma
 */
@RestController
public class EComController {

    @Autowired
    UserService userService;

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
    public ProductDetail getProduct(){
        return null;
    }

    /**
     * method returns product Details
     * @return
     */
    @RequestMapping("/registerSeller")
    public void registerSeller(@RequestParam String firstName, @RequestParam String middleName,@RequestParam String lastName,
                                  @RequestParam String phone,@RequestParam String email, @RequestParam String password){
        UUID uuid=userService.registerSeller(firstName,middleName,lastName,
               phone,email,password);
        String res="getDetails-"+userService.getUserDetail(uuid);
        System.out.println(res);

    }
}
