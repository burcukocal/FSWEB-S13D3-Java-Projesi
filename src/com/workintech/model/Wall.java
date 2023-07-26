package com.workintech.model;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        checkWidth(width);
        checkHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        checkWidth(width);
    }

    public void setHeight(double height) {
        checkHeight(height);
    }

    public void checkWidth(double width){
        if(width < 0){
            this.width = 0;
        }
        else{
            this.width = width;
        }
    }
    public void checkHeight(double height){
        if(height < 0){
            this.height = 0;
        }
        else{
            this.height = height;
        }
    }
    public double getArea(){
        return width * height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}
