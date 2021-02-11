package com.et.model;

/**
 * @author : anuj sharma
 */
public class ProductDetail {
    private long id;
    private String type;
    private String brand;
    private float mrp;
    private String discount;
    public ProductDetail(long id, String type,String brand,float mRP,String discount){
        this.id=id;
        this.type=type;
        this.brand=brand;
        this.mrp =mRP;
        this.discount=discount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getMrp() {
        return mrp;
    }

    public void setMrp(float mrp) {
        this.mrp = mrp;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "id:"+id+" type:"+type+" brand:"+brand+" MRP:"+ mrp +" discount:"+discount;
    }
}
