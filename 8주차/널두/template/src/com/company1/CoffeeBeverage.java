package com.company1;

import com.company1.CaffeinBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeBeverage extends CaffeinBeverage {

    @Override
    void brew() {
        System.out.println("필터로 커피 우려낸 중..");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 커피 추가하는 중..");
    }

    // 후크활용 -> 손님에게 물어보게 하고 싶다..
    public boolean customerWantCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
    private String getUserInput() {
        String answer = null;

        System.out.println("커피에 우유와 설탕을 넣어 드릴까요? (y / n) ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch(IOException ioe) {
            System.out.println("IO 오류");
        }
        if (answer == null) {
            return "no";
        }

        return answer;

    }
}
