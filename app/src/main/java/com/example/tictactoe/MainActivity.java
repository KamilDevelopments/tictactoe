package com.example.tictactoe;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
int ex=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        final String[] liczby = new String[9];
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ex = ex + 1;
                if (ex % 2 == 1) {
                    btn1.setText("X");
                    liczby[0] = "X";
                }
                if (ex % 2 == 0) {
                    btn1.setText("O");
                    liczby[0] = "O";
                }
                if (liczby[0].equals(liczby[1])&&liczby[0].equals(liczby[2])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[0].equals(liczby[4])&&liczby[0].equals(liczby[7])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
    });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ex = ex + 1;
                if (ex % 2 == 1) {
                    btn2.setText("X");
                    liczby[1] = "X";
                }
                if (ex % 2 == 0) {
                    btn2.setText("O");
                    liczby[1] = "O";
                }
                if (liczby[1].equals(liczby[0])&&liczby[1].equals(liczby[2])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[1].equals(liczby[4])&&liczby[1].equals(liczby[8])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[1].equals(liczby[3])&&liczby[1].equals(liczby[6])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ex = ex + 1;
                if (ex % 2 == 1) {
                    btn3.setText("X");
                    liczby[2] = "X";
                }
                if (ex % 2 == 0) {
                    btn3.setText("O");
                    liczby[2] = "O";
                }
                if (liczby[2].equals(liczby[0])&&liczby[2].equals(liczby[1])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[2].equals(liczby[5])&&liczby[2].equals(liczby[8])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;


                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[2].equals(liczby[4])&&liczby[2].equals(liczby[6])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;


                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ex = ex + 1;
                if (ex % 2 == 1) {
                    btn4.setText("X");
                    liczby[3] = "X";
                }
                if (ex % 2 == 0) {
                    btn4.setText("O");
                    liczby[3] = "O";
                }
                if (liczby[3].equals(liczby[4])&&liczby[3].equals(liczby[5])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[3].equals(liczby[1])&&liczby[3].equals(liczby[6])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ex = ex + 1;
                if (ex % 2 == 1) {
                    btn5.setText("X");
                    liczby[4] = "X";
                }
                if (ex % 2 == 0) {
                    btn5.setText("O");
                    liczby[4] = "O";
                }
                if (liczby[4].equals(liczby[3])&&liczby[4].equals(liczby[5])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[4].equals(liczby[0])&&liczby[4].equals(liczby[7])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[4].equals(liczby[2])&&liczby[4].equals(liczby[6])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[4].equals(liczby[1])&&liczby[4].equals(liczby[8])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ex = ex + 1;
                if (ex % 2 == 1) {
                    btn6.setText("X");
                    liczby[5] = "X";
                }
                if (ex % 2 == 0) {
                    btn6.setText("O");
                    liczby[5] = "O";
                }
                if (liczby[5].equals(liczby[4])&&liczby[5].equals(liczby[3])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[5].equals(liczby[2])&&liczby[5].equals(liczby[8])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ex = ex + 1;
                if (ex % 2 == 1) {
                    btn7.setText("X");
                    liczby[6] = "X";

                }
                if (ex % 2 == 0) {
                    btn7.setText("O");
                    liczby[6] = "O";
                }
                if (liczby[6].equals(liczby[7])&&liczby[6].equals(liczby[8])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[6].equals(liczby[4])&&liczby[6].equals(liczby[2])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[6].equals(liczby[1])&&liczby[6].equals(liczby[3])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ex = ex + 1;
                if (ex % 2 == 1) {
                    btn8.setText("X");
                    liczby[7] = "X";
                }
                if (ex % 2 == 0) {
                    btn8.setText("O");
                    liczby[7] = "O";
                }
                if (liczby[7].equals(liczby[6])&&liczby[7].equals(liczby[8])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[7].equals(liczby[0])&&liczby[7].equals(liczby[4])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }

            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ex = ex + 1;
                if (ex % 2 == 1) {
                    btn9.setText("X");
                    liczby[8] = "X";
                }
                if (ex % 2 == 0) {
                    btn9.setText("O");
                    liczby[8] = "O";
                }
                if (liczby[8].equals(liczby[6])&&liczby[8].equals(liczby[7])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[8].equals(liczby[2])&&liczby[8].equals(liczby[5])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                if (liczby[8].equals(liczby[1])&&liczby[8].equals(liczby[4])) {
                    Context context = getApplicationContext();
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    View toastView = toast.getView();
                    TextView toastMessage = (TextView) toastView.findViewById(android.R.id.message);
                    toastMessage.setTextSize(25);
                    toastMessage.setTextColor(Color.RED);
                    toastMessage.setGravity(Gravity.CENTER);
                    toastMessage.setCompoundDrawablePadding(16);
                    toastView.setBackgroundColor(Color.CYAN);
                    toast.show();
                }

            }
        });
if(ex==10)
{
    Context context = getApplicationContext();
    CharSequence text = "Its a draw!";
    int duration = Toast.LENGTH_LONG;

    Toast toast = Toast.makeText(context, text, duration);
    toast.show();

    }
}}