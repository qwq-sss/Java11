package SimpleGeometric;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object1 = new CircleFromSimpleGeometricOject(1);
		Object object2 = new RectangleFromSimpleGeometricObject(1,1);
		
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object object){
		if(object instanceof CircleFromSimpleGeometricOject){
			System.out.println("The circle area is " + ((CircleFromSimpleGeometricOject)object).getArea());
			System.out.println("The circle diameter is " + ((CircleFromSimpleGeometricOject)object).getDiameter());
		}
		else if(object instanceof RectangleFromSimpleGeometricObject){
			System.out.println("The rrrectangle area is " + ((RectangleFromSimpleGeometricObject)object).getArea());
		}
	}

}
