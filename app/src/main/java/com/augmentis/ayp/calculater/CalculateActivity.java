package com.augmentis.ayp.calculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CalculateActivity extends AppCompatActivity {

    TextView screenShow;
    TextView screenSol;
    String Operation;
    float numberFirst;
    CalculateTest calculateTest;

    public Button[] buttonNb;
    public int[] buttonNumbers = {
            R.id.button0,
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8,
            R.id.button9
    };

    public Button[] buttonOp;
    public int[] buttonOperator = {
            R.id.buttonplus,
            R.id.buttonminus,
            R.id.buttonmulti,
            R.id.buttondiv,
            R.id.buttonclean,
            R.id.buttoncal,
    };

//    public void calResult(){
//        float numberSecond = Float.parseFloat(screenShow.getText().toString());
//        float result = 0;
//        if(Operation.equals("+")){
//            result = numberFirst + numberSecond;
//        }
//        if(Operation.equals("-")){
//            result = numberFirst - numberSecond;
//        }
//        if(Operation.equals("*")){
//            result = numberFirst * numberSecond;
//        }
//        if(Operation.equals("/")){
//            result = numberFirst / numberSecond;
//        }
//        screenShow.setText(String.valueOf(result));
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        calculateTest = new CalculateTest();
        screenShow = (TextView) findViewById(R.id.screenshow);
        screenSol = (TextView) findViewById(R.id.screensol);

        int buttonNumSize = buttonNumbers.length;
        buttonNb = new Button[buttonNumSize];
        for (int i = 0; i < buttonNumSize; i++) {
            buttonNb[i] = (Button) findViewById(buttonNumbers[i]);
            buttonNb[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button btnNumber = (Button) v;
                    String textNumber = (String) btnNumber.getText();
                    calculateTest.pressNumber(textNumber);
                    screenShow.setText(calculateTest.temp);
                    screenSol.setText(screenSol.getText()+textNumber);
                }
            });
        }

        int buttonOpSize = buttonOperator.length;
        buttonOp = new Button[buttonOpSize];
        for (int i = 0; i < buttonOpSize; i++) {
            buttonOp[i] = (Button) findViewById(buttonOperator[i]);
            buttonOp[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button btnOperator = (Button) v;
                    String textOperator = (String) btnOperator.getText();

                    if (textOperator.equals("="))
                    {
                        calculateTest.pressEqual();
                        screenShow.setText(String.valueOf(calculateTest.result));
                    }
                    else
                    {
                        calculateTest.pressOperator(textOperator);
                        screenShow.setText(calculateTest.display);
                        screenSol.setText(screenSol.getText()+textOperator);
                    }
                }

            });

        }

    }}


//                    switch (v.getId()) {
//                        case R.id.buttonclean:
//                            screenShow.setText("0");
//                            numberFirst = 0;
//                            Operation="";
//                            DisplaySol="";
//                            Display="";
//                            break;
//                        case R.id.buttonplus:
//                            DisplaySol += "+";
//                            recordValue("+");
//                            break;
//                        case R.id.buttonminus:
//                            DisplaySol += "-";
//                            recordValue("-");
//                            break;
//                        case R.id.buttonmulti:
//                            DisplaySol += "*";
//                            recordValue("*");
//                            break;
//                        case R.id.buttondiv:
//                            DisplaySol += "/";
//                            recordValue("/");
//                            break;
//                        case R.id.buttoncal:
//                            DisplaySol = "";
//                            calResult();
//                            break;

//    public void recordValue(String str){
//
//        if(Operation.equals("")) {
//            Operation = str;
//            numberFirst = Float.parseFloat(screenShow.getText().toString());
//            Display = "";
//        }else{
//            calResult();
//            numberFirst =
//            Operation = str;
//            temp = "";
//        }
//        numberFirst = Float.parseFloat(screenShow.getText().toString());
//        Operation = str;
//        Display = "";
//
//    }
//
//}
