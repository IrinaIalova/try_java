package ru.point.pft.sandbox;

public class MyFirstProgram {

public static void main (String[] args){
  System.out.println("Hello, world!");


    double xb= 2.0;
    double xa= 1.0;
    double yb= 2.0;
    double ya= 1.0;
    double ab = Math.sqrt((xb - xa)*(xb - xa) + (yb - ya)*(yb - ya));

    System.out.println("Расстояние между двумя точками на плоскости " + ab );


}
}

