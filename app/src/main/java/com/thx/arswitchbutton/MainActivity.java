package com.thx.arswitchbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import ch.ielse.view.SwitchView;

public class MainActivity extends AppCompatActivity {
    private SwitchView switchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchView=findViewById(R.id.switch_ck);

        findViewById(R.id.ar_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchView.setCustomArColor(0xFFE3E3E3,0xFF4BD763);
                switchView.setLanguage(true);
            }
        });
        findViewById(R.id.en_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchView.setCustomEnColor(0xFF4BD763);
                switchView.setLanguage(false);
            }
        });
        findViewById(R.id.state_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),switchView.isOpened()?"打开":"关闭",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
