package com.mobile.takoumbo.phase1_challenge_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void loadAndelaWebPage(View view) {
        startActivity(new Intent(this, Andela2Activity.class ));
    }

    public void loadProfilePage(View view) {

        startActivity(new Intent(this, ProfileActivity.class));
    }
}
