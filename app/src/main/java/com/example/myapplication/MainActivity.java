package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user1 = new User("Rae", "Smart", 25, true);

        // Load followed value from the User object
        boolean followed = user1.followed;

        // Update the button text based on the followed value
        Button followButton = findViewById(R.id.button);
        if (followed) {
            followButton.setText("Followed");
        } else {
            followButton.setText("Follow");
        }

        // Set OnClickListener for the button
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the followed value
                user1.followed = !user1.followed;

                // Update the button text based on the new followed value
                if (user1.followed) {
                    followButton.setText("Followed");
                } else {
                    followButton.setText("Follow");
                }

                // Perform any additional actions based on the button click
                // ...
            }
        });

        // Retrieve data from intent extras
        Intent intent = getIntent();
        String name = intent.getStringExtra("MAD");
        int randomNumber = intent.getIntExtra("randomNumber", 0);

        TextView textView = findViewById(R.id.textView2);
        textView.setText(String.format("MAD " + randomNumber));


    }
}


