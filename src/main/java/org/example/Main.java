package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfInputIsAnEvenNumber(121));
    }

    public static boolean checkIfInputIsAnEvenNumber(int number) {
        return number % 2 == 0;

    }
}