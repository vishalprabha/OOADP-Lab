
import java.util.*;
 abstract class Game {

    abstract void initialize();
    abstract void startplay();
    abstract void endplay();
    public final void play() {
      initialize();
      startplay();
      endplay();

    }

}

class Cricket extends Game {


    public void initialize() {
        System.out.println("Cricket i");
    }


    public void startplay() {
        System.out.println("Cricket s");
    }


    public void endplay() {
      System.out.println("Cricket e");
    }



}

class football extends Game {

    public void initialize() {
      System.out.println("Football i");
    }


    public void startplay() {
        System.out.println("Football s");
    }


    public void endplay() {
        System.out.println("Football e");
    }




}
class Templatepatterndemo {


    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        game = new football();
        game.play();
    }

}
