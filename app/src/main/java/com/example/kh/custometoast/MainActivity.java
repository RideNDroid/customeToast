package com.example.kh.custometoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void customeProcess(View view){
        Toast toast = new Toast(this);
        LayoutInflater inflater = getLayoutInflater();
        view = inflater.inflate(R.layout.toast_custome, (ViewGroup) findViewById(R.id.linear));
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0,0);
        toast.setView(view);
        toast.show();

    }
}
