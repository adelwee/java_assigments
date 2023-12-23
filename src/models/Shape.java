package models;


import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> points = new ArrayList<>();

    // addPoint(Point) - adds to the container
    public void addPoint(Point point){
        points.add(point);
    }
    // calculatePerimeter()
    public double getPerimeter(){
        double[] l = getLengths();
        double perimeter = 0;
        for(int i=0;i<l.length;++i){
            perimeter += l[i];
        }
        return perimeter;
    }

    // getAverageSide()
    public double getAverageSide(){
        return getPerimeter()/points.size();
    }

    // getLongestSide()
    public double getLongestSide(){
        double[] l = getLengths();
        double longest = l[0];
        for(int i=1;i<l.length;++i){
            if(l[i] > longest)
                longest = l[i];
        }
        return longest;
    }

    private double[] getLengths() {
        double[] lengths = new double[points.size()];
        for (int i = 0; i < points.size(); i++) {
            int next_index = (i+1) % points.size();
            lengths[i] = points.get(i).getDistance(points.get(next_index));
        }
        return lengths;
    }
}