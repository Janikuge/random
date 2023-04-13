package com.depth.random;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText inputEditText;
    Button generateButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEditText = findViewById(R.id.inputEditText);
        generateButton = findViewById(R.id.generateButton);
        resultTextView = findViewById(R.id.resultTextView);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputEditText.getText().toString();
                String[] values = input.split(",");
                if (values.length > 0) {
                    int randomIndex = new Random().nextInt(values.length);
                    resultTextView.setText(values[randomIndex].trim());
                }
            }
        });
    }
}
