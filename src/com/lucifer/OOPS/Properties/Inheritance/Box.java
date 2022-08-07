package com.lucifer.OOPS.Properties.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    // cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }
    Box(double l, double w, double h){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public void informartion(){
        System.out.println("Running the box");
    }
}























