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

    /**
     * Add product ot inventory
     * @param p
     */
    public void addProduct(ProductDetail p){
        products.add(p);
    }

    /**
     * fetch all product from inventory
     * @param p
     */
    public List<ProductDetail> fetchAll(){
        return products;
    }

    /**
     * fetch product by Type
     * @param p
     */
    public List<ProductDetail> fetchByType(ProductDetail p){
        return products;
    }

    public void printInventory(){
        for(ProductDetail p : products){
            System.out.println(p.toString());
        }
    }
}
