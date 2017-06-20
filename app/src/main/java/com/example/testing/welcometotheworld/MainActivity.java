package com.example.testing.welcometotheworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cn.qian.domain.User;

public class MainActivity extends AppCompatActivity {
private EditText name;
    private EditText age;
    private Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = (Button)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = (EditText)findViewById(R.id.name);
                age = (EditText)findViewById(R.id.age);
                //封装数据
                User user = new User(name.getText().toString(),Integer.parseInt(age.getText().toString()));
               //创建一个Bundle对象
                Bundle bundle = new Bundle();
                bundle.putSerializable("user",user);
                //创建一个Intent
                Intent intent = new Intent(MainActivity.this,Welcome.class);
                intent.putExtras(bundle);
                //启动Activity
                startActivity(intent);

            }
        });
    }



}
