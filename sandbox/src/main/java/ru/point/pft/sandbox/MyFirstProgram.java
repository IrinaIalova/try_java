package ru.point.pft.sandbox;

public class MyFirstProgram {

public static void main (String[] args){

    Point a = new Point(3.0,1.0);
    Point b = new Point(2.0,2.0);
    System.out.println("Расстояние между двумя точками " + distance(a, b));
    System.out.println("Расстояние между двумя точками " + a.distance(b));
}

public static double distance(Point p1, Point p2) {
    return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));
}

}

