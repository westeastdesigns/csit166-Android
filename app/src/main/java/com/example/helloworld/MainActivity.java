package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDisplayButton();
    }
    private void initDisplayButton() {
        Button displayButton = findViewById(R.id.buttonDisplay);
        displayButton.setOnClickListener(new OnClickListener () {

            @Override
            public void onClick(View view) {
                EditText editName = findViewById(R.id.editTextName);
                TextView textDisplay = findViewById(R.id.textViewDisplay);
                String nameToDisplay = editName.getText().toString();
                Resources res = getResources(); // Asks the system for access to the values files
                String displayString = res.getString(R.string.welcome_message, nameToDisplay);
                // Creates the string with a message and name
                textDisplay.setText(displayString);
            }
        });
    }
}