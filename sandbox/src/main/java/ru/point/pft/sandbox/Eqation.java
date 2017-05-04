package ru.point.pft.sandbox;

/**
 * Created by iriska on 5/4/17.
 */
public class Eqation {
    private double a;
    private double b;
    private double c;

    private int n;

    public Eqation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double d = b*b-4*a*c;

        if (d > 0) {
            n = 2;
        } else {
            if (d==0){
                n = 1;
            } else {
                n = 0;
            }
        }
    }
    public int rootnumber() {
        return n;
    }
}