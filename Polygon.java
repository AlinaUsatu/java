package com.company;

import java.util.ArrayList;

public class Polygon extends Figure {
    ArrayList<Point> pointPolygon = new ArrayList<>();

  private   Polygon() {


      Point a = new Point(0, 3);
      Point b = new Point(2, 3);
      Point c = new Point(5, 2);


      if (a.isSame(b)) {
          throw new GeometricException();
      }

      pointPolygon.add(a);
      pointPolygon.add(b);
      pointPolygon.add(c);

      pointPolygon.remove(a);
      pointPolygon.remove (b);
      pointPolygon.remove(c);

      pointPolygon.equals(a);
      pointPolygon.equals (b);
      pointPolygon.equals(c);



      //boolean pointPolygon = (a == b);


      //boolean Polygon= pointPolygon.equals(a) == pointPolygon.equals(b) ==pointPolygon.equals(c);
     // if( a.isSame(b) )


      //throw new GeometricException();


          //return 0;
      }



    Polygon (Point... pp ) {

        for (Point a:pp) {
            System.out.println(a);

            pointPolygon.add(a);
            pointPolygon.remove(a);
            pointPolygon.equals(a);



            //  ?.add(?)
        }




            }
        @Override
        public double circumference () {
            return 0;

    }

    @Override
    public double area() throws GeometricException{

        throw new GeometricException();
        //return 0;
    }
}
// Spoly = |1/2*|



