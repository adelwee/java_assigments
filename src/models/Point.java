package models;

import java.lang.Math;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }


    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }


    // distance(Point dest) - distance from current point to the dest point
    public double getDistance(Point point_2){
        return Math.sqrt(Math.pow(x-point_2.getX(),2.0)+Math.pow(y-point_2.getY(), 2.0));
    }

    @Override
    public String toString(){
        return String.format("Class: Point, x = %f, y = %f",x ,y);
    }
}