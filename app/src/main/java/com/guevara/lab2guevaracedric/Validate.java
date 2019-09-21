package com.guevara.lab2guevaracedric;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Validate extends AppCompatActivity {
    EditText etCourse1, etCourse2, etCourse3, etCourse4, etCourse5, etCourse6, etCourse7, etCourse8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate);
        Button b=(Button) findViewById(R.id.button4);
    }

    public void validate(View v){
        SharedPreferences sp = getSharedPreferences("myData",MODE_PRIVATE);
        String course1SP = sp.getString("course1", null);
        String course2SP = sp.getString("course2", null);
        String course3SP = sp.getString("course3", null);
        String course4SP = sp.getString("course4", null);
        String course5SP = sp.getString("course5", null);
        String course6SP = sp.getString("course6", null);
        String course7SP = sp.getString("course7", null);
        String course8SP = sp.getString("course8", null);
        String course1 = etCourse1.getText().toString();
        if(course1.equals(course1SP) || course1.equals(course2SP) || course1.equals(course3SP) || course1.equals(course4SP) ||
                course1.equals(course5SP) || course1.equals(course6SP) || course1.equals(course7SP) || course1.equals(course8SP)){
            Toast.makeText(Validate.this, "Course is valid", Toast.LENGTH_SHORT).show();
        }
        else(Toast.makeText(Validate.this, "invalid course", Toast.LENGTH_SHORT)).show();
    }
    public void openPrevious(View a){
        Intent e= new Intent(this, MainActivity.class);
        startActivity(e);
    }
}
