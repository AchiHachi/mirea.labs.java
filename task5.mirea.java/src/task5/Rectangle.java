package task5;

import java.awt.*;

public class Rectangle extends Shape {

    @Override
    protected int FirstParameters() {
        return 10 + (int) (Math.random() * 50);
    }

    @Override
    protected int SecondParameters() { return 10 + (int) (Math.random() * 50); }

    @Override
    protected Color setColor() { return getColor(); }
}