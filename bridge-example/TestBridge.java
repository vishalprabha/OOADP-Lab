class DP1{
    public static void draw_a_line(double x1,double y1,double x2,double y2){
        System.out.println("LINE FROM ("+x1+","+y1+" TO ("+x2+","+y2+")");
    }
}

class DP2 {
    public static void drawline(double x1,double y1,double x2,double y2){
        System.out.println("LINE FROM ("+x1+","+y1+" TO ("+x2+","+y2+")");
    }
}

abstract class Drawing{
    abstract void getDescription();
    abstract void drawLine(double x1,double y1,double x2,double y2);
}

class V1Drawing extends Drawing{
    void getDescription(){
    System.out.println("IM USING DP1");
    }

    void drawLine(double x1,double y1,double x2,double y2){
    DP1.draw_a_line(x1,y1,x2,y2);
    }
}

class V2Drawing extends Drawing{
    void getDescription(){
        System.out.println("IM USING DP2");
    }

    void drawLine(double x1,double y1,double x2,double y2){
        DP2.drawline(x1,y1,x2,y2);
    }
}

abstract class Shape{
    Drawing drawing;
    public Shape(Drawing drawing){
        this.drawing=drawing;
    }

    abstract void draw();
}

class Rectangle extends Shape{
    double _x1,_y1,_x2,_y2;
    Rectangle(Drawing dp,double x1,double y1,double x2,double y2){
        super(dp);
        _x1=x1;
        _y1=y1;
        _x2=x2;
        _y2=y2;
    }

    public void draw(){
        drawing.getDescription();
        drawing.drawLine(_x1,_y1,_x2,_y1);
        drawing.drawLine(_x2,_y1,_x2,_y2);
        drawing.drawLine(_x2,_y2,_x1,_y2);
        drawing.drawLine(_x1,_y2,_x1,_y1);
    }
}

public class TestBridge{
    public static void main(String [] args){
        Drawing dp1=new V1Drawing();
        Drawing dp2=new V2Drawing();
        Shape rect1=new Rectangle(dp1,10,200,20,100);
        rect1.draw();
        Shape rect2=new Rectangle(dp2,10,200,20,100);
        rect2.draw();
    }
}