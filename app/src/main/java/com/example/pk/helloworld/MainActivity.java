package com.example.pk.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        final Button setTextButton = (Button) findViewById(R.id.set_text_button);
        final Button clearButton = (Button) findViewById(R.id.clear_button);

        setTextButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.set_text_button:
                textView.setText("Hello world!");
                break;
            case R.id.clear_button:
                textView.setText("");
                break;
        }
    }
}
