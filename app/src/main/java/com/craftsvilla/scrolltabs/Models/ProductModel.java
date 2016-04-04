package com.craftsvilla.scrolltabs.Models;

import java.io.Serializable;

/**
 * Created by naresh on 31/3/16.
 */
public class ProductModel implements Serializable {
    String id;
    String name;

    public ProductModel(String id,String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
