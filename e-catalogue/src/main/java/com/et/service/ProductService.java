package com.et.service;

import com.et.model.ProductDetail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Anuj Sharma
 **/
@Service
public class ProductService {

    private List<ProductDetail> products;

    public ProductService(){
        products = new ArrayList();
    }

    public void addProduct(ProductDetail p){
        products.add(p);
    }

    public void printInventory(){
        double sum = 0;
        for(ProductDetail p : products){
            System.out.println(p.toString());
        }
        System.out.println("Average is: " + sum);
    }
}
