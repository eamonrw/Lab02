package com.weingoldeamon.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Resources res;
    String[] messages;
    TextView textBox, messageBox;
    EditText textField;
    Button submitButton, messageButton;
    int messageI = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBox = findViewById(R.id.text_box);
        textField = findViewById(R.id.text_field);
        submitButton = findViewById(R.id.submit_button);
        messageBox = findViewById(R.id.message_box);
        messageButton = findViewById(R.id.message_button);
        res = getResources();
        messages = res.getStringArray(R.array.messages);
    }

    public void submitName(View view) {
        textBox.setText(textField.getText().toString());
    }

    public void nextMessage(View view) {
        messageBox.setText(messages[messageI]);
        messageI++;
        if(messageI >= messages.length)
            messageI = 0;
    }
}
