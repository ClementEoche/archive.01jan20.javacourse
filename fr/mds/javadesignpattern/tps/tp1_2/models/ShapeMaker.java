package fr.mds.javadesignpattern.tps.tp1_2.models;

import java.util.Arrays;
import java.util.List;

import fr.mds.javadesignpattern.tps.tp1_2.facade.Shape;

public class ShapeMaker {
    public static final String CIRCLE = "Circle";
    public static final String RECTANGLE = "Rectangle";
    public static final String SQUARE = "Square";

    private List<Shape> facades = Arrays.asList(new Rectangle(), new Square(), new Circle());
    private String type;

    public ShapeMaker() {
        this.type = null;
    }

    public ShapeMaker(String type) {
        this.type = type;
    }
    
    public void draw() {
        for (Shape facade : facades) {
            if (facade.getClass().getSimpleName().equals(type)) {
                facade.draw();
            }
        }
    }

    public void draw(String typeD) {
        for (Shape facade : facades) {
            if (facade.getClass().getSimpleName().equals(typeD)) {
                facade.draw();
            }
        }
    }
    
    public void drawCircle() {
        for (Shape facade : facades) {
            if (facade instanceof Circle) {
                facade.draw();
            }
        }
    }

    public void drawRectangle() {
        for (Shape facade : facades) {
            if (facade instanceof Rectangle) {
                facade.draw();
            }
        }
    }

    public void drawSquare() {
        for (Shape facade : facades) {
            if (facade instanceof Square) {
                facade.draw();
            }
        }
    }
}

