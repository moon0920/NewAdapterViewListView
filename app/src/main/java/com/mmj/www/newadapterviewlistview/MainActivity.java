package com.mmj.www.newadapterviewlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] FRUITS = new String[] {"APPLE", "PEAR", "GRAPE", "PERSIMMON"};
        ListView listView = (ListView)findViewById(R.id.resultlist);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.listviewsinglecolumn,FRUITS);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
        //1차수정


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        String text = ((TextView)view).getText().toString();
       // String text = adapterView.getItemAtPosition(position).toString();
        Toast.makeText(view.getContext(),text,Toast.LENGTH_SHORT).show();


    }
}
