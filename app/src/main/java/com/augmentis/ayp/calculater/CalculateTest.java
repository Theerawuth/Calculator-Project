package com.augmentis.ayp.calculater;

/**
 * Created by Theerawuth on 7/22/2016.
 */
public class CalculateTest {

    String temp ="";
    String currentOperator="";
    int mainNumbers = 0;
    int mainNumbers2 = 0;
    int result;

    public void pressNumber(String s) {
        temp += s;
    }

    public void pressOperator(String s) {

        if(currentOperator.equals("")) {
            currentOperator = s;
            mainNumbers = Integer.parseInt(temp);
            temp = "";
        }else{
            pressEqual();
            mainNumbers = result;
            currentOperator = s;
            temp = "";
        }

    }

    public void pressEqual() {
        switch (currentOperator){
            case "+":
                result = mainNumbers + Integer.parseInt(temp);
                break;
            case "-":
                result = mainNumbers - Integer.parseInt(temp);
                break;
            case "*":
                result = mainNumbers * Integer.parseInt(temp);
                break;
            case "/":
                result = mainNumbers / Integer.parseInt(temp);
                break;
        }
    }

    public int getResult() {
        return result;
    }
}
