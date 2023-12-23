import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            File file = new File("C://Users/Adel/IdeaProjects/assigment1se2312/src/source.txt");

            Scanner sc = new Scanner(file);
            Shape shape = new Shape();

            while (sc.hasNext()) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                Point point = new Point(x, y);
                shape.addPoint(point);
            }
            System.out.println(shape.getPerimeter());
            System.out.println(shape.getLongestSide());
            System.out.println(shape.getAverageSide());
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("file not found");
        }
    }
}