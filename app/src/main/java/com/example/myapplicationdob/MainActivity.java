package com.example.myapplicationdob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtxtName=findViewById(R.id.edtxtName);
        final EditText edtxtDay=findViewById(R.id.edtxtDay);
        final EditText edtxtMonth=findViewById(R.id.edtxtMonth);
        final EditText edtxtYear=findViewById(R.id.edtxtYear);
        final TextView textView=findViewById(R.id.textView2);

        Button button=findViewById(R.id.btnSubmit);

        final Intent MyIntent=new Intent(MainActivity.this,MainActivity2.class);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String strName=edtxtName.getText().toString();
               String strday=edtxtDay.getText().toString();

               String strMonth=edtxtMonth.getText().toString();

                       String strYear=edtxtYear.getText().toString();

               if(strName.equals(""))
                {
                    edtxtName.setError("Please enter name");
                    edtxtName.requestFocus();
                }

               else if ( strday.equals("") && strMonth.equals("") && strYear.equals(""))
               {
                    textView.setText("Enter Your DOB");

               }

              else
               {

                   MyIntent.putExtra("Name8", strName);
                   MyIntent.putExtra("Day", strday);
                   MyIntent.putExtra("Month", strMonth);
                   MyIntent.putExtra("Year", strYear);

                   startActivity(MyIntent);
               }


           }
       });


    }
}
