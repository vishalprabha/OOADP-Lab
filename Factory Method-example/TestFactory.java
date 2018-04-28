public class TestFactory{
    public static void main(String [] args){
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}

interface Shape{
    void draw();
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("INSIDE RECTANGLE::DRAW() METHOD");
    }
}

class Circle implements Shape{
    public void draw(){
        System.out.println("INSIDE CIRCLE::DRAW() METHOD");
    }
}

class ShapeFactory{
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}