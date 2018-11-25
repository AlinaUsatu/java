package com.company;



import java.util.Scanner;
public class Main {

    public static String radius;
    private static Object GeometricException;

    public static void main(String[] args) throws Throwable {
        // write your code here
        Point a = new Point();
        System.out.println(a.toString());


        System.out.println("Задайте координаты первой точки на плоскости: ");
        // Применяем к объекту метод для ввода координат с клавиатуры
        //   a.inputPoint();
        // Создаём второй объект с помощью конструктора с двумя параметрами
        // Параметры мы указали такие, что точка также совпадёт с началом
        // отсчёта, как если бы воспользовались консутрктором по умолчанию.
        Point b = new Point(0, 0);
        System.out.println(Point.distance(a, b));

        Point cc = new Point(5, 2);
        System.out.println(cc.toString());
        System.out.println("----");
        Polygon pol = new Polygon(a, b, cc);
        System.out.println(pol);

        System.out.println("Задайте координаты второй точки на плоскости: ");
        // Применяем ко второму объекту метод для ввода координат с клавиатуры
        //  b.inputPoint();
        /* Далее мы проверим совпадают ли точки и, если нет, то вычислим
         * расстояние между ними и выведем его на экран. Сравнение точек мы
         * производим с помощью метода, сравнение a==b всегда даст ложный
         * результат, поскольку a и b хранят ссылки (адреса) объектов, а даже
         * два объекта с одинаковыми значениями всех свойств имеют разные
         * адреса в памяти.
         */
        if (a.isSame(b)) {
            System.out.println("Точки совпадают!");
        } else {
            System.out.println("Расстояние между точками: " + b.getDistance(a));
        }
        /* Далее мы проверим какая из точек расположена ближе к началу
         * координат. И сообщим об этом пользователю.
         */
        if (a.getRadius() < b.getRadius()) {
            System.out.println("К началу координат ближе первая точка!");
        } else if (a.getRadius() == b.getRadius()) {
            System.out.println("Точки равноудалены от начала координат!");
        } else {
            System.out.println("К началу координат ближе вторая точка!");
        }
        Circle c = new Circle();


        //c.readCircle();
        System.out.println("Задайте координаты центра окружности: ");
        System.out.println("Длина окружности равна: " + c.circumference());
        System.out.println("Площадь окружности равна: " + c.area());
        double p = c.area();
        System.out.println("Площадь окружности равна: " + p);


        Cut cut = new Cut(a, b);
        Polygon poly = new Polygon();
        System.out.println(poly.pointPolygon.size());
        System.out.println("Количество точек у многоугольника: " + poly.pointPolygon);

        if (a.isSame(b)) { throw (Throwable) GeometricException;

               //throw new GeometricException();

            }

            //boolean pointPolygon = (a == b);
            //boolean pointline = (a == b);

            //     c.print();

            //c.readFromKeyboard();

            // perimeter - ??

            // new Circle(20,20,30);

            // line = new Cut(a,b)
            // perimeter - ?


        }

    }

