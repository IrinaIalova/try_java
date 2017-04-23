package ru.point.pft.sandbox;

/**
 * Created by iriska on 4/23/17.
 */
public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
    this.x = x;
    this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((this.x - p.x),2) + Math.pow((this.y - p.y),2));
    }

}
