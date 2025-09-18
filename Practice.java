//package com.company;

class Cylinder{
    private int radius;
    private int height;

    //constructor for the radius and height
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double Area()
    {
        return (2 * Math.PI * radius * height)+(2 * Math.PI * radius * radius);
    }
    public double Volume()
    {
        return Math.PI * radius * radius * height;
    }
}
//Class for the rectangular
class Rectangular
{
    private int length;
    private int breath;

    public Rectangular() {
        this.length = 4;
        this.breath = 5;
    }

    public Rectangular(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
}
public class Practice
{
    public static void main(String[] args)
    {
//        Cylinder myCylinder = new Cylinder(9, 12);
////        myCylinder.setHeight(12);
//        System.out.println(myCylinder.getHeight());
////        myCylinder.setRadius(9);
//        System.out.println(myCylinder.getRadius());
//
//        System.out.println(myCylinder.Area());
//        System.out.println(myCylinder.Volume());

        Rectangular R1 = new Rectangular();
        System.out.println(R1.getLength());
        System.out.println(R1.getBreath());

        Rectangular R2 = new Rectangular(12,56);
        System.out.println(R2.getLength());
        System.out.println(R2.getBreath());



    }
}
