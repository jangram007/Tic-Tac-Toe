package com.manishjangra.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int count =0;
    int flag =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });

    }
    private void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

        public void Check(View view){
            Button btnCurrent = (Button) view;
            count++;
            if(flag ==0){
                btnCurrent.setText("X");
                flag=1;
            }else{
                btnCurrent.setText("O");
                flag=0;
            }

            if(count>4){
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                //Conditions
                if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                    //1
                }else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
                    //2
                }else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
                    //2
                }else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")){
                    //2
                }else if (b7.equals(b5) && b5.equals(b3) && !b7.equals("")){
                    //2
                }else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                    //2
                }else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")){
                    //2
                }else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
                    //2
                }
                }
            }

        }



