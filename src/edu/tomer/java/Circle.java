package edu.tomer.java;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by Tomer on 14/03/2017.
 */
public class Circle {
    private double radius;

    public Circle(double radius) throws Exception {
        if (radius < 0)
            throw new Exception("Negative radius: " + radius);
        this.radius = radius;
    }
}
