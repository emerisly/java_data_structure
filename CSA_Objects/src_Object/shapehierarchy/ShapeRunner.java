package shapehierarchy;

import javax.sound.midi.Soundbank;

public class ShapeRunner {

	public static void main(String[] args) {
		
		Shape[] shapeArr= {new Circle(10),new Circle(15),new Circle(17)};
		
		// TODO Auto-generated method stub
		Shape s1=new Rectangle(10,20);
		Shape s2=new RectangularPrism(10,12,13);
		System.out.println(s1);
		System.out.println(s2);
		
		/*
		if(s1.compareTo(s2)>0) {
			System.out.println("s1 is bigger");
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("s2 is bigger");
		}
		else {
			System.out.println("s1 is the same as s2");
		}
		
		for(int i=0;i<shapeArr.length;i++) {
			System.out.println(i+"area: "+shapeArr[i].area());
			System.out.println(i+"circumference: "+((Circle)shapeArr[i]).circumference());
		}
		*/
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
	}

}
