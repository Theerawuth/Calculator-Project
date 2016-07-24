package com.augmentis.ayp.calculater;

/**
 * Created by Theerawuth on 7/22/2016.
 */
public class CalculateTest {

    String temp ="";
    String currentOperator="";
    float firstNumbers;
    float secondNumbers;
    float result;
    String display;

    public void pressNumber(String s) {
        temp += s;
    }

    public void pressOperator(String s) {

        if(currentOperator.equals(""))
        {
            currentOperator = s;
            firstNumbers = Float.parseFloat(temp);
            result = firstNumbers;
            temp = "";
        }
        else
        {
            pressEqual();
            firstNumbers = result;
            currentOperator = s;
            temp = "";
        }

    }

    public void pressEqual() {
        secondNumbers = Float.parseFloat(temp);
        switch (currentOperator){
            case "+":
                result = firstNumbers + secondNumbers;
                break;
            case "-":
                result = firstNumbers - secondNumbers;
                break;
            case "*":
                result = firstNumbers * secondNumbers;
                break;
            case "/":
                result = firstNumbers / secondNumbers;
                break;
        }
        display = String.valueOf(result);
    }

    public float getResult() {

        return result;
    }
}
