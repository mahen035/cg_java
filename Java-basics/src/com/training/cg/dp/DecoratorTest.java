package com.training.cg.dp;

public class DecoratorTest {

	public static void main(String[] args) {
		Shape square = new Square();
		
		Shape blueSquare = new BlueShapeDecorator(new Square());
		
		Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
		
		System.out.println("Drawing normal square::");

		square.draw();
		
		System.out.println("Drawing square with blue border::");
		
		blueSquare.draw();
		
		System.out.println("Drawing rectangle with blue border::");
		
		blueRectangle.draw();
	}

}
