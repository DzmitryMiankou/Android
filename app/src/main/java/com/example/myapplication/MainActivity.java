package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView resultTextView;
        EditText textField_1, textField_2;
        Button addButton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.textView);
        textField_1 = findViewById(R.id.textField1);
        textField_2 = findViewById(R.id.textField2);
        addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number, number2, res;
                String text1, text2, resString, errString, nullString;

                resString = "Результат: ";
                errString = "Заполните все поля";
                nullString = "Вы нашли степень '0'";

                text1 = textField_1.getText().toString();
                text2 = textField_2.getText().toString();

                if (text1.length() == 0 || text2.length() == 0) {
                    resultTextView.setText(errString);
                    showToast(errString);
                    return;
                }

                number = Integer.parseInt(text1);
                number2 = Integer.parseInt(text2);
                //res = number + number2;
                Exponentiation answer = new Exponentiation(number, number2);

                if (number == 0 & number2 == 0) {
                    resultTextView.setText(nullString);
                    showToast(nullString);
                } else {
                    String right_result = resString + number + " в степни " + number2 + " = " + answer.getResult();
                    resultTextView.setText(String.valueOf(right_result));
                }
            }
        });
    }

    private void showToast(String text) {
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
        toast.show();
    }
}