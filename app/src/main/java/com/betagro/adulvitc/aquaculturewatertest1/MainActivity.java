package com.betagro.adulvitc.aquaculturewatertest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView QualitygridView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QualitygridView = (GridView) findViewById(R.id.gridView);

        final int[] imageInts = new int[]{R.drawable.temp1, R.drawable.do1,
                R.drawable.ph1, R.drawable.alk1, R.drawable.amo1,
                R.drawable.nitrite1, R.drawable.hard1, R.drawable.disk1};

        GridAdapter gridAdapter = new GridAdapter(this, imageInts);

        QualitygridView.setAdapter(gridAdapter);

        QualitygridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "clicked :" +imageInts[i] , Toast.LENGTH_SHORT).show();
            }
        });


    }   //Main Method







}   //Mani Class
