package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String food_name[]=getResources().getStringArray(R.array.food);
        textView= this.<TextView>findViewById(R.id.show1);
        Intent intent1=getIntent();
        String value=intent1.getStringExtra("tag");

        try {
            int num=Integer.parseInt(value);
            textView.setText(food_name[num]);
        }catch (Exception e){
            Toast.makeText(this, "Is Problem", Toast.LENGTH_SHORT).show();
        }


    }
}
