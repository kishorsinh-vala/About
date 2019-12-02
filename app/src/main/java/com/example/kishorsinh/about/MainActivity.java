package com.example.kishorsinh.about;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton black,grey;
    RelativeLayout rl;
    GridView lst;

    String[] arrayList,arrayList2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=findViewById(R.id.rd_grp);
        black=findViewById(R.id.rd_black);
        rl=findViewById(R.id.rl_lay);
        lst=(GridView) findViewById(R.id.lst);
        grey=findViewById(R.id.rd_grey);

        rl.setBackgroundColor(Color.BLACK);
        lst.setBackgroundColor(Color.BLACK);
        black.setTextColor(Color.WHITE);
        grey.setTextColor(Color.WHITE);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(black.isChecked())
                {
                    black.setTextColor(Color.WHITE);
                    grey.setTextColor(Color.WHITE);
                    rl.setBackgroundColor(Color.BLACK);
                    lst.setBackgroundColor(Color.BLACK);

                }
                else
                {
                    black.setChecked(false);
                    black.setTextColor(Color.WHITE);
                    grey.setTextColor(Color.WHITE);
                    rl.setBackgroundColor(Color.GRAY);
                    lst.setBackgroundColor(Color.GRAY);
                }

            }
        });

        arrayList=getResources().getStringArray(R.array.txt1);
        arrayList2=getResources().getStringArray(R.array.txt2);
        cAdpt adapter=new cAdpt(getApplicationContext(),arrayList,arrayList2);
        lst.setAdapter(adapter);
    }
}
