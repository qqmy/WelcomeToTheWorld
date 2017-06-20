package com.example.testing.welcometotheworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import cn.qian.domain.User;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView name = (TextView) findViewById(R.id.name);
        TextView age = (TextView) findViewById(R.id.age);
        //获取启动该Activity的Intent
        Intent intent = getIntent();
        //直接通过Intent取出它所携带的Bundle数据包中的数据
        User user = (User) intent.getSerializableExtra("user");
        name.setText("恭喜您:" + user.getName());
        age.setText("来到这个世界第" + user.getAge() + "年!");
    }
}
