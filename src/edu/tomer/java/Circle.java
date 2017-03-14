package edu.tomer.java;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by Tomer on 14/03/2017.
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0)
            throw new NegativeRadiusException(String.valueOf(radius));
        this.radius = radius;
    }
}
