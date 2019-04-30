package com.moregood.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.moregood.customview.view.PieData;
import com.moregood.customview.view.PieView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    PieView pieView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        pieView = findViewById(R.id.pieView);
//        ArrayList<PieData> datas = new ArrayList<>();
//        datas.add(new PieData("A",20));
//        datas.add(new PieData("B",20));
//        datas.add(new PieData("c",20));
//        pieView.setData(datas);
    }
}
