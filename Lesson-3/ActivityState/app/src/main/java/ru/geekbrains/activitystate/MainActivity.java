package ru.geekbrains.activitystate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int counter1 = 0;       // первый счетчик
    private int counter2 = 0;       // Второй счетчик

    private TextView textCounter1;  // пользовательский элемент 1-го счетчика
    private TextView textCounter2;  // пользовательский элемент 1-го счетчика

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получить пользовательские элементы по идентификатору
        textCounter1 = findViewById(R.id.textView1);
        textCounter2 = findViewById(R.id.textView2);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2++;

                //установить текст на TextView
                textCounter2.setText(String.format(Locale.getDefault(), "%d", counter2));
            }
        });
    }

    // Обработка кнопки через атрибут onClick в макете
    public void button1_onClick(View view) {
        counter1++;

        // Установить текст на TextView
        textCounter1.setText(String.format(Locale.getDefault(), "%d", counter1));
    }
}