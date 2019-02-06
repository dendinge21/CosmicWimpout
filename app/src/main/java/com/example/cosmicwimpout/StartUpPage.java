package com.example.cosmicwimpout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartUpPage extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_up);

        Button playGame = (Button)findViewById(R.id.playGame);
        playGame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(StartUpPage.this, MainActivity.class));
    }
}
