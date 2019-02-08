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
public class Circle extends Shape {
    private float radius;
    private String name;

    public Circle(float radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public float getRadius() {
        return radius;
    }

    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

  
    }

