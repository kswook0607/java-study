package chapter03.paint.main;

import chapter03.paint.canvas.Canvas;
import chapter03.paint.point.ColorPoint;
import chapter03.paint.point.Point;
import chapter03.paint.shape.Circle;
import chapter03.paint.shape.Triangle;

public class Paint {

	public static void main(String[] args) {

				Canvas canvas = new Canvas();
				
				Point point1 = new Point();
				point1.setX(10);
				point1.setY(20);

				canvas.drawPoint(point1);

				Point point2 = new Point();
				point2.setX(10);
				point2.setY(20);
				canvas.drawPoint(point2);
						
				
			}	
	
	public void drawColorPoint(ColorPoint colorpoint) {
		colorpoint.show();
		
	public void drawTriangle(Triangle triangle) {
		draw.triangle;
			}
	
	
	ColorPoint point3 = new ColorPoint();
	point3.setX(50);
	point3.setY(60);
	point3.setColor("red");
	point3.show();
	canvas.drawColorPont(poin3);
	
	
	Circle c = new Circle();
	System.out.println(c instanceof Object);
	
	//오류: 컴파일 타임에 타입 검사도 하기 때문에 상속 하이어리키(hierachy)전혀 없으면 에러 발생
	
	Object o = new Circle();
	if(o instanceof String) {
		String s = (String)o;
	}
	
	// 우측항이 인터페이스인 경우
	// 상속 hierachy 상관 없이 사용할 수 있다.
	
	System.out.println(c instanceof Drawable);
	System.out.println(c instanceof Serializable);
	
	
			
}	
	
	
	
	
	
	
	
}
