package com.dogpo.minlegtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.buttonSend);
        editText = (EditText) findViewById(R.id.editText);
        imageView= (ImageView) findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showMessage("Button clicked");
                loadImage();
            }
        });
    }

    private void loadImage() {
        Glide.with(this).load("http://loremflickr.com/320/240").error(R.mipmap.ic_launcher).into(imageView);

    }

    private void showMessage(String s) {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }


}
