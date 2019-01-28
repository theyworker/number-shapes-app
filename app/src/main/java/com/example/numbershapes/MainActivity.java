package com.example.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void numberDetails(View view){
        EditText numberField = (EditText) findViewById(R.id.editText);
        int number = Integer.valueOf(numberField.getText().toString());


        if(isTriangular(number)){
            Log.i("A", "numberDetails: Its Triangular ");
        }

        if (IsNumberSquare(number)){
            Log.i("A", "numberDetails: Its Square ");
        }
    }

    public boolean isTriangular(int input)
    {
        int currentTriNum = 0;
        int n=0;

        while (currentTriNum < input)
        {
            currentTriNum += n;
            n++;
        }

        if (currentTriNum != input)
            return false;
        else
           return true;


    }

    public boolean IsNumberSquare(int num) {


            for (int i = 0; i < num / 2 + 2; i++)
            {
                if (i * i == num)
                {
                    return true;
                }
            }
            return false;
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
