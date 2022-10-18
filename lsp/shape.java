package com.solid.lsp;

public class Shape {
    public int height;
    public int width;

    
    public int getArea() {
        return height*width;
    }

    public void setHeight(int height) {
        this.height = height;
    
    }

    public void setWidth(int width) {
        this.width = width;
    }


    
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
