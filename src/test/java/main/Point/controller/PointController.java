package main.Point.controller;

import main.Point.data.Point;

public class PointController {

    private Point point;


    public void addX (Point point) {
        point.setX(point.getX() + 1);
    }

    public void minusX(Point point) {
        point.setX(point.getX() - 1);
    }

    public void addY (Point point) {
        point.setY(point.getY() + 1);
    }

    public void minusY(Point point) {
        point.setY(point.getY() - 1);
    }





}
