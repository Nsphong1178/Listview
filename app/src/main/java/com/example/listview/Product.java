package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
class Product {
    String name;
    int productID;
    int image;

//    String description;
    public Product(int productID, String name, int image) {
        this.name = name;
        this.productID = productID;
        this.image = image;
//        this.description = description;
    }
}