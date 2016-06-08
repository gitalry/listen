package com.example.jamesg.gridbybucky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView=(TextView)findViewById(R.id.textView);
                       textView.setText("Hebrews 11:6. And without faith it is impossible to please God, because anyone who comes to him must believe that he exists and that he rewards those who earnestly seek him");
                    }
                }
        );






    }
}
