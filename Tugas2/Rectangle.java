/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.stmikamik;

/**
 *
 * @author user-4
 */
public class Rectangle extends Shape{
    private String name;
    private long length;
    private long width;

    public Rectangle(String name, long length, long width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public long getLength() {
        return length;
    }

    public long getWidth() {
        return width;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return length * width;
    }

}
