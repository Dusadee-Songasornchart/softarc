package com.solid.lsp;

public class Square extends Shape {

    Square(int side) {
        this.setSide(side);
    }

    public void setSide(int side) {
        this.width = side;
        this.height = side; 
    }
    
    public int getArea() {
        return width * height;
    }
}
