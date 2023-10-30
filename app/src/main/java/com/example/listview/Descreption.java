package com.example.listview;
import android.widget.ImageView;
import android.widget.TextView;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Descreption  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desription);
        Intent intent = getIntent();
        String itemName = intent.getStringExtra("item_name");
        String itemDescription = intent.getStringExtra("item_description");
        int imageResourceId = intent.getIntExtra("item_image", -1);

        TextView nameTextView = findViewById(R.id.title);
        TextView descriptionTextView = findViewById(R.id.description);
        ImageView imageView = findViewById(R.id.image); // Thay đổi R.id.imageView thành ID của ImageView của bạn

        imageView.setImageResource(imageResourceId);
        nameTextView.setText(itemName);
        descriptionTextView.setText(itemDescription);
    }
}

