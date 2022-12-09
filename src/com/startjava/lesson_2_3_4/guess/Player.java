package com.startjava.lesson_2_3_4.guess;

public class Player {

    private final String name;
    private final int[] numbers = new int[10];
    private int attempt;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void addNumber(int number) {
        numbers[attempt] = number;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}

