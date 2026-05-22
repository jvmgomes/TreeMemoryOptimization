package src.treetype;

import java.awt.Color;

public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        // Code to draw the tree at position (x, y) using its color and texture
        System.out.println("Drawing a " + name + " tree at (" + x + ", " + y + ") with color " + color + " and texture " + texture);
    }
}
