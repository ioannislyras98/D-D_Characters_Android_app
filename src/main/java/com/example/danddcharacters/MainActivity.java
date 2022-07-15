package com.example.danddcharacters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (AppCompatButton) findViewById(R.id.ChooseCharacter);
        button2 = (Button) findViewById(R.id.CreateCharacter);
        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 openCreateCharacter();
            }
        });
    button2.setOnClickListener( new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openChooseCharacter();
        }
    });
}
    public void openChooseCharacter(){
        Intent intent = new Intent(this, ChooseCharacter.class);
        startActivity(intent);
    }
    public void openCreateCharacter(){
        Intent intent = new Intent(this, CreateCharacter.class);
        startActivity(intent);
    }
}