package chapter08.exercise;

public class Shape {
    public void draw(){
        System.out.println("Shape");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("Triangle");
    }
}
