package com.example.helloworld2;
import android.widget.TextView;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public native String getString();
    static { System.loadLibrary("HelloWorld"); }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView log = (TextView)findViewById(R.id.Log);
        log.setText(getString());
    }
}
