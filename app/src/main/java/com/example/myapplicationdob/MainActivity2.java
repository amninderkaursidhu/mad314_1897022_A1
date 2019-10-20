package com.example.myapplicationdob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();

        TextView txtAge=findViewById(R.id.txtOutAge);



        String strName = intent.getStringExtra("Name8");
        String strDay = intent.getStringExtra("Day");
        String strMonth = intent.getStringExtra("Month");
        String strYear = intent.getStringExtra("Year");


        int day,month,year;

        day=Integer.parseInt(strDay);
        month=Integer.parseInt(strMonth);
        year=Integer.parseInt(strYear);

        Calendar date1Calendar = Calendar.getInstance();
        int toDay=date1Calendar.get(Calendar.DAY_OF_MONTH);
        int todayMonth=date1Calendar.get(Calendar.MONTH);
        int todayYear=date1Calendar.get(Calendar.YEAR);

       int aged,agem,agey;

       aged=toDay-day;
       agem=todayMonth-month;
       agey=todayYear-year;

        if(day<=toDay && month<=todayMonth )
        {
            txtAge.setText("Hello "+strName +",You are "+aged+" Days "+agem+" Months " +agey+ " years old.");
        }
        else
        {
            txtAge.setText("Hello "+strName+" ,you are "+agey+" years old");
        }

    }
}