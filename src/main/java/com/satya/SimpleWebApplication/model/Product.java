package com.satya.SimpleWebApplication.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int prodPrice;

    public Product(){

    }

    public Product(int prodId, String prodName, int prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    //id setters and getters
    public void setProdId(int prodId){
        this.prodId = prodId;
    }

    public int getProdId(){
        return prodId;
    }


    //name setters and getters
    public void setProdName(String prodName){
        this.prodName = prodName;
    }
    public String getProdName(){
        return prodName;
    }


    //price setters and getters
    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdPrice() {
        return prodPrice;
    }


    //toString


    @Override
    public String toString() {
        return "Product{" + "prodId=" + prodId + ", prodName='" + prodName + '\'' + ", prodPrice=" + prodPrice + '}';
    }
}
