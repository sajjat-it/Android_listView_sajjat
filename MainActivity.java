package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String food_name[]=getResources().getStringArray(R.array.food);
        listView= this.<ListView>findViewById(R.id.list);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.design,R.id.design1,food_name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                String value=String.valueOf(position);
                intent.putExtra("tag",value);
                startActivity(intent);
            }
        });

    }
}
