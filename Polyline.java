package com.company;

import java.util.ArrayList;

public class Polyline extends Figure {
    ArrayList<Point> pointPolyline = new ArrayList<>();


    Point a = new Point(0, 5);
    Point b = new Point(6, 0);



    public Polyline(Point a , Point b) {

        this.a= a;
        this.b=b;
    }


    @Override
    public double circumference() throws GeometricException{

        return 0;
    }

    @Override
    public double area() throws GeometricException{

        throw new GeometricException();

        //  return 0;
    }

    private Polyline() {
        Point a = new Point(0,3);
        Point b = new Point(2,3);
        Point c = new Point(5,2);

        pointPolyline.add(a);
        pointPolyline.add(b);
        pointPolyline.add(c);

        pointPolyline.remove(a);
        pointPolyline.remove (b);
        pointPolyline.remove(c);

    }
    Polyline (Point... pp ) {

        for (Point a:pp) {
            System.out.println(a);

            pointPolyline.add(a);
            pointPolyline.remove(a);
            //  ?.add(?)


            //boolean pointline = (a == b);

            if (a.isSame(b)) {
                throw new GeometricException();
            }

            }

    }

}

