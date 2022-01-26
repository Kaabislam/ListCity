package com.example.simpleparadox.listycity;

import static com.example.simpleparadox.listycity.R.layout.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        TextView tv = findViewById(R.id.t1);
        tv.setText(intent.getStringExtra("cityName"));
        Button b = findViewById(R.id.Back);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(ShowActivity.this, MainActivity.class);
                ShowActivity.this.startActivity(send);
            }
        });
    }

}