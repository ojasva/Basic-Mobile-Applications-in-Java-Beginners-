package com.example.gridview;

import java.util.ArrayList;

public class Item {
    String item_name,desc, price,disc,mrp;
    int image;
    public Item(int image, String item_name,String desc, String price, String disc,String mrp){
        this.image = image;
        this.item_name = item_name;
        this.desc = desc;
        this.price = price;
        this.disc = disc;
        this.mrp = mrp;
    }

    public int getImage(){
        return image;
    }

    public String getItem_name(){
        return item_name;
    }

    public String getDescription(){
        return desc;
    }

    public String getPrice(){
        return price;
    }
    public String getDiscount(){
        return disc;
    }
    public String getMrp(){
        return mrp;
    }

}
