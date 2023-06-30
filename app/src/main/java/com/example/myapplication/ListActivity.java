package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);
                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Perform action upon Close button click
                    }
                });
                builder.setNegativeButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Perform action upon View button click
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

                // Generate a random integer
                int randomNumber = generateRandomNumber();

                // Launch MainActivity with the random number
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                intent.putExtra("randomNumber", randomNumber);
                startActivity(intent);


            }

        });
}

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(); // Generates a random number between 0 and 99
    }}