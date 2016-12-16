package com.example.samsung.p0091_onclickbuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOout;
    Button btn1, btn2, btn3;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.d(TAG, "найдём View-элементы");

        //найдём View-элементы
        tvOout = (TextView) findViewById(R.id.tvOut);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        //Устанавливаем обработчик для кнопки 1
        //создаём обработчик нажатия кнопки 1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    //Меняем текст в TextView (tvOut)
                    int i = 6/0;
                    tvOout.setText("Результат деления = " + i);
                } catch (Exception e) {
                    Log.d(TAG, "Делить на 0 нельзя!", e);
                }

            }
        });

        //Устанавливаем обработчик для кнопки 2
        btn2.setOnClickListener(this);

    }

    //создаём обработчик нажатия кнопки 2
    @Override
    public void onClick(View view) {

        Log.d(TAG, "Обработаем нажатие кнопки 2");
        //Меняем текст в TextView (tvOut)
        tvOout.setText("Нажата кнопка 2");

    }

    //создаём обработчик нажатия кнопки 3
    public void clickBtn3(View view) {

        Log.d(TAG, "Обработаем нажатие кнопки 3");
        //Меняем текст в TextView (tvOut)
        tvOout.setText("Нажата кнопка 3");

    }

}
