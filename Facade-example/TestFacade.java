import java.util.*;
interface customize{
    void change();
}

class fontSize implements customize{
    public void change(){
        int s;
        System.out.println("ENTER THE NEW FONT SIZE:");
        Scanner in=new Scanner(System.in);
        s=in.nextInt();
        System.out.println("FONT SIZE CHANGED TO "+s);
    }
}

class fontType implements customize{
    public void change(){
        String t;
        System.out.println("ENTER THE NEW FONT TYPE:");
        Scanner c=new Scanner(System.in);
        t=c.next();
        System.out.println("FONT TYPE CHANGED TO "+t);
    }
}

class color implements customize{
    public void change(){
        String color;
        System.out.println("ENTER THE NEW COLOR:");
        Scanner m=new Scanner(System.in);
        color=m.nextLine();
        System.out.println("COLOR CHANGED TO "+color);
    }
}

class customizeApp{
    private customize size;
    private customize type;
    private customize col;

    public customizeApp() {
        size = new fontSize();
        type = new fontType();
        col = new color();
    }

    public void changeSize(){
        size.change();
    }

    public void changeType(){
        type.change();
    }

    public void changeColor(){
        col.change();
    }
}

public class TestFacade{
    public static void main(String [] args){
        customizeApp custApp=new customizeApp();
        custApp.changeSize();
        custApp.changeType();
        custApp.changeColor();
    }
}