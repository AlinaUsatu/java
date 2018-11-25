package com.company;
import java.awt.*;
import java.util.Scanner;

public abstract class Figure {
    public abstract double circumference();
    public abstract double area ();
    protected String color = "black";
    int thickness = 20;

    public String getColor() {
        return color;
    }

}



