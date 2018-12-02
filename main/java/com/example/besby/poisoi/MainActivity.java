package com.example.besby.poisoi;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        RadioButton radioButton1 = (RadioButton)findViewById(R.id.radioButton1groop);
        RadioButton radioButton2 = (RadioButton)findViewById(R.id.radioButton2groop);
        if (radioButton1.isChecked()) {
            Intent intent1 = new Intent(MainActivity.this,groop1Activity.class);
            startActivity(intent1);


        } else if(radioButton2.isChecked()){
            Intent intent2 = new Intent(MainActivity.this,groop2Activity.class);
            startActivity(intent2);

        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Вы не выбрали подгруппу!",Toast.LENGTH_SHORT);
            toast.show();
        }

    }
    public void onClick2(View view) {
        finish();
    }
}
