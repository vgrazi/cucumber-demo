package com.vgrazi.demo.cucumberdemo;

public class Belly {
    private int time;
    private int cukes;

    public void eat(int cukes) {
        this.cukes = cukes;
    }

    public void waitHours(int time) {
        this.time = time;
    }

    public boolean isGrowl() {
        return cukes>=10 && time >= 2;
    }
}
