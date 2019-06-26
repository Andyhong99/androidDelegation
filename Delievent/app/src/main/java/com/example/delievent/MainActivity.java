package com.example.delievent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    TextView bellTextView;
    TextView labelTextVeiw;
    CheckBox repeatCheckView;
    CheckBox vibrateCheckView;
    Switch switchView;

    float initX;
    long initTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bellTextView = (TextView)findViewById(R.id.bell_name);
        labelTextVeiw=(TextView)findViewById(R.id.label);
        repeatCheckView=(CheckBox)findViewById(R.id.repeatCheck);
        vibrateCheckView=(CheckBox)findViewById(R.id.vibrate);
        switchView=(Switch)findViewById(R.id.onOff);

        bellTextView.setOnClickListener(this);
        labelTextVeiw.setOnClickListener(this);

        repeatCheckView.setOnClickListener(this);
        vibrateCheckView.setOnClickListener(this);
        switchView.setOnClickListener(this);
    }

    private void showToast(String message){

        Toast toast=Toast.makeText(this,message,Toast.LENGTH_SHORT);
    }

    @Override
    public void onClick(View v){

        if(v==bellTextView){
            showToast("bell text click event..");
        }else if(v==labelTextVeiw){
            showToast("label text click event...");
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){

        if(buttonView==repeatCheckView){
            showToast("repeat checkbox is "+isChecked);
        }else if(buttonView==vibrateCheckView){
            showToast("vibrate checkbox is "+isChecked);
        }else if(buttonView==switchView){
            showToast("switch is "+isChecked);
        }

    }
}
