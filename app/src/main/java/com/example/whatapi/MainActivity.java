package com.example.whatapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_num;
    EditText txt_code;
    Button btn_Go;

    String number;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_num=(EditText) findViewById(R.id.txt_Num);
        txt_code=(EditText)findViewById(R.id.txt_code);
        btn_Go=(Button)findViewById(R.id.btn_go);

        btn_Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = txt_num.getText().toString();
                number = "+"+txt_code.getText().toString()+number;

                url = "http://wa.me/"+number;
               // Toast.makeText(MainActivity.this, "Value:"+url, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
//9767488337


    }
}