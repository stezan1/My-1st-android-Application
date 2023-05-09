package com.example.my1stapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText edittext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        edittext=findViewById((R.id.Nbox));
        textview=findViewById((R.id.textView));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                if(edittext.getText().equals(null)) {
                    Toast.makeText(MainActivity.this, "enter number", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    int ic = Integer.parseInt(s);
                    double nc = ic * 1.6;
                    textview.setText("Nepali value is " + nc);
                }

            }
        });

    }
}