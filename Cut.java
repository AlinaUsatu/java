package com.company;

import javax.sound.sampled.Line;

public  class Cut extends Figure {

    Point a = new Point(0, 5);
    Point b = new Point(6, 0);

    public Cut(Point a , Point b) {

        this.a= a;
        this.b=b;

    }

@Overrride
public String toString(){
        return "Line: "+a+"--"+b+"";
}

    @Override
    public double circumference () {
        return a.getDistance(b);
    }

    @Override
    public double area() throws GeometricException{

        throw new GeometricException();

        //return x;
    }

    /*
double getDistance(Point a) {
return Math.sqrt( Math.pow(y2-y1, 2) + Math.pow(x2-x1, 2) );
*/


}
