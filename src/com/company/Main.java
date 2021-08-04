package com.company;

public class Main {

    public static void main(String[] args) {

        int aa = 20; // здесь будет делаться случайное число
        int ba = 45;
        int ageRandom = aa + (int) (Math.random() * ((ba - aa) + 1));
        

        int at = 20; // здесь будет делаться случайное число
        int bt = 45;
        int tempRandom = at + (int) (Math.random() * ((bt - at) + 1));


        test("VOZRAST ", ageRandom, "TEMPERATURA ", tempRandom);


        int resultatIzTogoCamogoMetoda = totSamiyMetod(ageRandom, tempRandom);
        //возвращаемый метод с входящими параметрами
        System.out.println(resultatIzTogoCamogoMetoda + " izMetoda");

    }

    public static int totSamiyMetod(int ageRandom, int tempRandom) {

        int result = ageRandom + tempRandom;
        return result;

    }

    public static void test(String word, int vozrast, String word1, int temperature) {
        System.out.println(word + vozrast);
        System.out.println(word1 + temperature);
    }

}

