package com.company;

public class Main {

    public static void main(String[] args) {

        int aa = 0; // здесь будет делаться случайное число
        int ba = 100;
        int ageRandom = aa + (int) (Math.random() * ((ba - aa) + 1));


        int at = -20; // здесь будет делаться случайное число
        int bt = 45;
        int tempRandom = at + (int) (Math.random() * ((bt - at) + 1));


        test("VOZRAST ", ageRandom, "TEMPERATURA ", tempRandom);




    }


    public static void test(String word, int vozrast, String word1, int temperature) {
        System.out.println(word + vozrast);
        System.out.println(word1 + temperature);
        int age = vozrast;
        int temp = temperature;

        if ((age >= 20 && age <= 45) && (temp >= -2 && temp <= 30))
            System.out.println("go to walk");
        else if (age < 20 && temp >= 0 && temp <= 28)
            System.out.println("go to walk");
        else if (age >= 45 && temp >= -10 && temp <= 25)
            System.out.println("go to walk");
        else System.out.println("stay at home");
    }

}

