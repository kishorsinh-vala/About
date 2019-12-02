package com.example.kishorsinh.about;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

class cAdpt extends BaseAdapter {
    Context context;
    String[] st_txt1,st_txt2;
    LayoutInflater inflter;
    public cAdpt(Context applicationContext, String[] arrayList, String[] arrayList2) {
        this.context = applicationContext;
        st_txt1=arrayList;
        st_txt2=arrayList2;
        inflter = (LayoutInflater.from(applicationContext));

    }

    @Override
    public int getCount() {
        return st_txt1.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflter.inflate(R.layout.lstdata, null);
        TextView txt=convertView.findViewById(R.id.rl_txt1);
        TextView txt2=convertView.findViewById(R.id.rl_txt2);
        txt.setText(st_txt1[position]) ;
        txt2.setText(st_txt2[position]) ;
        return convertView;
    }
}
