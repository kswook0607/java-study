package chapter03.paint.shape;

import chapter03.paint.point.Point;

public class Triangle extends Shape {
	
	private Point[] points;
	private String lineColor;
	private String fillColor;
	@Override
	public void draw() {
		System.out.println("삼각형을 그렸습니다.");
	}
	

	}
	