public class TestAdapter{
    public static void main(String [] args) {
        Shape rect=new Rectangle();
        Shape cir=new Circle();
        rect.fill();
        rect.draw();
        rect.display();
        cir.display();
    }
}

abstract class Shape{
    abstract void fill();
    abstract void draw();
    abstract void display();
}

class Rectangle extends Shape{
    XXRectangle myRectangle=new XXRectangle();
    void fill(){
        myRectangle.fillIt();
    }
    void draw(){
        myRectangle.drawIt();
    }
    void display(){
        myRectangle.displayIt();
    }
}

class Circle extends Shape{
    void fill(){
        System.out.println("I AM GETTING A COLOUR");
    }
    void draw(){
        System.out.println("THIS IS HOW IM CREATED");
    }
    void display(){
        System.out.println("THIS IS HOW I LOOK");
    }
}

class XXRectangle{
    public void fillIt(){
        System.out.println("I AM GETTING A COLOUR");
    }
    public void drawIt(){
        System.out.println("THIS IS HOW IM CREATED");
    }
    public void displayIt(){
        System.out.println("THIS IS HOW I LOOK");
    }
}

