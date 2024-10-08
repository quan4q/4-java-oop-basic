package com.example.task05;

import java.util.ArrayList;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private final ArrayList<Point> points;
    /**
     * Устанавливает точки ломаной линии
     *
     * @param //points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public PolygonalLine(){
        points = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        for(Point point : points){
            addPoint(point);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double len = 0.0;

        for(int i = 1; i < points.size(); i++){
            len += points.get(i-1).getLength(points.get(i));
        }
        return len;
    }

}
