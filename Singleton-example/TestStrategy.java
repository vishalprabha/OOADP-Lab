public class TestStrategy {
    public static void main(String [] args) {
        Duck md=new MallardDuck();
        md.display();
        md.performFly();
        md.setFlyBehaviour(new FlyRocketSpeed());
        md.performFly();
        md.performQuack();
        md.setQuackBehaviour(new squeak());
        md.performQuack();
        Duck rd=new RubberDuck();
        rd.display();
        rd.performFly();
        rd.performQuack();
    }
}

abstract class Duck {
    QuackBehaviour qb;
    FlyBehaviour fb;
    public void swim() {
        System.out.println("I AM SWIMMING");
    }

    abstract void display();

    void performFly(){
        fb.fly();
    }

    void performQuack(){
        qb.quack();
    }

    public void setFlyBehaviour(FlyBehaviour newFb){
        fb=newFb;
    }

    public void setQuackBehaviour(QuackBehaviour newQb){
        qb=newQb;
    }
}

class MallardDuck extends Duck {
    MallardDuck(){
        fb=new fly1();
        qb=new quack1();
    }

    void display(){
        System.out.println("I AM A MALLARD DUCK");
    }
}

class RubberDuck extends Duck{
    RubberDuck(){
        fb=new noFly();
        qb=new squeak();
    }

    void display(){
        System.out.println("I AM A RUBBER DUCK");
    }
}

interface FlyBehaviour {
    public void fly();
}

interface QuackBehaviour{
    public void quack();
}

class fly1 implements FlyBehaviour{
    public void fly(){
        System.out.println("I AM FLYING");
    }
}

class noFly implements FlyBehaviour{
    public void fly(){
        System.out.println("SORRY I AM UNABLE TO FLY");
    }
}

class FlyRocketSpeed implements FlyBehaviour{
    public void fly(){
        System.out.println("BEWARE I AM A ROCKET NOW");
    }
}

class squeak implements QuackBehaviour{
    public void quack(){
        System.out.println("Squeeeeek");
    }
}

class quack1 implements QuackBehaviour{
    public void quack(){
        System.out.println("QUACK! QUACK!");
    }
}

class mute implements QuackBehaviour{
    public void quack(){
        System.out.println("SILENCE PLEASE");
    }
}