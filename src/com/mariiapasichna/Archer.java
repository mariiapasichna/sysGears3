package com.mariiapasichna;

public class Archer {
    public static final int STEPS = 20;
    private int priority;
    private double startChance;

    public Archer(int priority, double startChance) {
        this.priority = priority;
        this.startChance = startChance;
    }

    public int getPriority() {
        return priority;
    }

    public double probabilityByStep(int step) {
        return (1 - startChance) / STEPS * step + startChance;
    }
}