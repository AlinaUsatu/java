package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Circle extends Figure {

    public double r;// радиус
    public Point c; // центр

    //   public static double Point(Point point1, Point point2) {
    //    return point1.setPoint(point2);
    //}

    // возвращает строку с описанием окружности
    @Overrride
    public String toString() {
        return "Окружность с центром в точке " + c + " и радиусом " + r;
    } // выводит на экран описание окружности

    public void print() {
        System.out.print(this.toString());
    }


    @Override
    public double circumference() {
        double circumference = Math.PI * 2 * r;
        return circumference;
    }

    public double area() {

        double area = Math.PI * (r * r);
        return area;
    }


    public void readCircle() {


        System.out.println(" Введите точку - центр окружности: ");
        c = new Point();
        c.inputPoint();


        System.out.println("Введите радиус ");
        try (Scanner sc = new Scanner(System.in)) {
            r = sc.nextDouble();
            //Площадь круга вычисляется по формуле = PI*radius*radius

        }


    }

    Circle() {
        c=new Point(0,0);
        r=1;
    }
//    public Circle (double x, double y){
//        r=30;
//        this.x = x;
//        this.y = y;
//        this.r = 30;
//        if( a.isSame(b) ) {
//            System.out.println("Точки совпадают!") + ;
//        } else {
//            System.out.println("Расстояние между точками: "+b.getDistance(a));
//        }
//    }


}



