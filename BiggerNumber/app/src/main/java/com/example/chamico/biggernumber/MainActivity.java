package com.example.chamico.biggernumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int num1 = 0;
    private int num2 = 0;
    private int score = 0;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pickNumbers();

    }

    public void pickNumbers(){
        Button leftbutton = (Button) findViewById(R.id.leftButton);
        Button rightbutton = (Button) findViewById(R.id.rightButton);

        Random random = new Random();

        while (true){
            num1=random.nextInt(10);
            num2=random.nextInt(10);
            if(num1 != num2)
                break;
        }

        //System.out.println("num1 "+num1+"num2 "+num2);

        //leftbutton.setText(""+ num1);
        //rightbutton.setText(""+ num2);

        TextView points = (TextView) findViewById(R.id.textView);
        points.setText("得分: "+ score);
        TextView points1 = (TextView) findViewById(R.id.textView2);
        points1.setText("次数: "+ count);

        count++;
    }

    public void left_click(View view) {
        //Button btn = (Button)findViewById(R.id.leftButton);
        //Toast.makeText(this,"Left Button",Toast.LENGTH_SHORT).show();

        if(num1 >num2){
            //Toast.makeText(this,"正确",Toast.LENGTH_SHORT).show();
            score++;
        }else {
            //Toast.makeText(this,"错误",Toast.LENGTH_SHORT).show();
            score--;
        }
        pickNumbers();
        TextView points = (TextView) findViewById(R.id.textView);
        points.setText("得分: "+ score);
    }

    public void right_click(View view) {
        //Button btn = (Button)findViewById(R.id.rightButton);
        //Toast.makeText(this,"right Button",Toast.LENGTH_SHORT).show();

        if(num1 < num2){
            //Toast.makeText(this,"正确",Toast.LENGTH_SHORT).show();
            score++;
        }else {
            //Toast.makeText(this,"错误",Toast.LENGTH_SHORT).show();
            score--;
        }
        pickNumbers();
        TextView points = (TextView) findViewById(R.id.textView);
        points.setText("得分: "+ score);

    }
}
