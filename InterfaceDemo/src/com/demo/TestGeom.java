package com.demo;

public class TestGeom {

	public static void main(String[] args) {

            Geometery  geom = new Geometery();
            Circle  c= new Circle();
            Rectangle rect = new Rectangle();
            geom.draw(c);
            geom.draw(rect);
            Shape.print();
            rect.display();
	}

}
