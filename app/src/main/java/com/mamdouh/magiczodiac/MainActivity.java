package com.mamdouh.magiczodiac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_Ready;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Ready =(Button)findViewById(R.id.btn_Ready);

        btn_Ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ready = new Intent(MainActivity.this, intro.class);
                startActivity(Ready);
            }
        });
    }
}
