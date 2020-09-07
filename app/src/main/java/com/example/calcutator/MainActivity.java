package com.example.calcutator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.calcutator.util.Const;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private AppCompatButton Bnt1, Bnt2, Bnt3, BntDivid, Bnt4, Bnt5, Bnt6, BntMul, Bnt7, Bnt8, Bnt9, Bntpluse, BntClear, Bnt0, BntEqual, BntMines;
    private double val1 = 0.0;
    int i;
    private double val2 = 0.0;
    private int action = 0;
    private AppCompatTextView outputTV, inputTV;
    private double total = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inItButton();
        initUI();
    }

    private void initUI() {
        Bnt1.setOnClickListener(this);
        Bnt2.setOnClickListener(this);
        Bnt3.setOnClickListener(this);
        BntDivid.setOnClickListener(this);
        Bnt4.setOnClickListener(this);
        Bnt5.setOnClickListener(this);
        Bnt6.setOnClickListener(this);
        BntMul.setOnClickListener(this);
        Bnt7.setOnClickListener(this);
        Bnt8.setOnClickListener(this);
        Bnt9.setOnClickListener(this);
        Bntpluse.setOnClickListener(this);
        BntClear.setOnClickListener(this);
        Bnt0.setOnClickListener(this);
        BntEqual.setOnClickListener(this);
        BntMines.setOnClickListener(this);
    }

    private void inItButton() {
        outputTV = findViewById(R.id.outputTV);
        inputTV = findViewById(R.id.inputTV);
        Bnt1 = findViewById(R.id.Bnt1);
        Bnt2 = findViewById(R.id.Bnt2);
        Bnt3 = findViewById(R.id.Bnt3);
        BntDivid = findViewById(R.id.BntDivid);
        Bnt4 = findViewById(R.id.Bnt4);
        Bnt5 = findViewById(R.id.Bnt5);
        Bnt6 = findViewById(R.id.Bnt6);
        BntMul = findViewById(R.id.BntMul);
        Bnt7 = findViewById(R.id.Bnt7);
        Bnt8 = findViewById(R.id.Bnt8);
        Bnt9 = findViewById(R.id.Bnt9);
        Bntpluse = findViewById(R.id.Bntpluse);
        BntClear = findViewById(R.id.BntClear);
        Bnt0 = findViewById(R.id.Bnt0);
        BntEqual = findViewById(R.id.BntEqual);
        BntMines = findViewById(R.id.BntMines);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Bnt1:
                inputTV.setText(inputTV.getText().toString().trim() + Bnt1.getText().toString().trim());
                break;
            case R.id.Bnt2:
                inputTV.setText(inputTV.getText().toString().trim() + Bnt2.getText().toString().trim());
                break;
            case R.id.Bnt3:
                inputTV.setText(inputTV.getText().toString().trim() + Bnt3.getText().toString().trim());
                break;
            case R.id.BntDivid:
                calculate();
                action = Const.DIVIDE;
                inputTV.setText(inputTV.getText().toString().trim() + BntDivid.getText().toString().trim());
                break;
            case R.id.Bnt4:
                inputTV.setText(inputTV.getText().toString().trim() + Bnt4.getText().toString().trim());
                break;
            case R.id.Bnt5:
                inputTV.setText(inputTV.getText().toString().trim() + Bnt5.getText().toString().trim());
                break;
            case R.id.Bnt6:
                inputTV.setText(inputTV.getText().toString().trim() + Bnt6.getText().toString().trim());
                break;
            case R.id.BntMul:
                calculate();
                action = Const.MUL;
                inputTV.setText(inputTV.getText().toString().trim() + BntMul.getText().toString().trim());
                break;
            case R.id.Bnt7:
                inputTV.setText(inputTV.getText().toString().trim() + Bnt7.getText().toString().trim());
                break;
            case R.id.Bnt8:
                inputTV.setText(inputTV.getText().toString().trim() + Bnt8.getText().toString().trim());
                break;
            case R.id.Bnt9:
                inputTV.setText(inputTV.getText().toString().trim() + Bnt9.getText().toString().trim());
                break;
            case R.id.Bntpluse:
                calculate();
                action = Const.PLUS;
                inputTV.setText(inputTV.getText().toString().trim() + Bntpluse.getText().toString().trim());
                break;
            case R.id.BntClear:

                inputTV.setText("");
                outputTV.setText("");
                val1 = 0.0;
                val2 = 0.0;
                break;
            case R.id.Bnt0:
                inputTV.setText(inputTV.getText().toString().trim() + Bnt0.getText().toString().trim());
                break;
            case R.id.BntEqual:
                calculate();
                action = Const.EQL;
                DecimalFormat df = new DecimalFormat("0.##");
                outputTV.setText(df.format(total));
                break;
            case R.id.BntMines:
                calculate();
                action = Const.MINUS;
                inputTV.setText(inputTV.getText().toString().trim() + BntMines.getText().toString().trim());
                break;
        }
    }


    public void calculate() {
        if (val1 != 0.0) {


            switch (action) {
                case Const.PLUS:
                    val2 = Double.parseDouble(inputTV.getText().toString().trim().substring(inputTV.getText().toString().trim().indexOf("+") + 1));
                    total = val1 + val2;
                    break;
                case Const.MINUS:
                    val2 = Double.parseDouble(inputTV.getText().toString().trim().substring(inputTV.getText().toString().trim().indexOf("-") + 1));
                    total = val1 - val2;
                    break;
                case Const.MUL:
                    val2 = Double.parseDouble(inputTV.getText().toString().trim().substring(inputTV.getText().toString().trim().indexOf("*") + 1));
                    total = val1 * val2;
                    break;
                case Const.DIVIDE:

                        val2 = Double.parseDouble(inputTV.getText().toString().trim().substring(inputTV.getText().toString().trim().indexOf("/") + 1));
                        total = val1 / val2;


                    Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();
                    break;
                case Const.EQL:
                    break;
            }
        } else {
            val1 = Double.parseDouble(inputTV.getText().toString().trim());
        }
    }


}