package SimpleGeometric;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayObject(new CircleFromSimpleGeometricOject(1,"red",true));
		displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
	}
	
       public static void displayObject(SimpleGeometricObject object){
			System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
		}
}
