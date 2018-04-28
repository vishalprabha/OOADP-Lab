public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty=true;
        boiled=false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("CREATING UNIQUE INSTANCE OF CHOCOLATE BOILER    ");
            uniqueInstance = new ChocolateBoiler();
        }

        System.out.println("RETURNING UNIQUE INSTANCE OF CHOCOLATE BOILER");
        return uniqueInstance;
    }

    public void fill() {
        if(isEmpty()) {
            empty=false;
            boiled=false;
            // fill the boiler with milk/chocolate mixture
            System.out.println("FILLING THE BOILER WITH MIXTURE");
        }
    }

    public void drain() {
        if(!isEmpty()&&isBoiled()) {
            //drain the boiled milk and chocolate
            System.out.println("DRAINING THE MILK/CHOCOLATE MIXTURE");
            empty=true;
        }
    }

    public void boil() {
        if(!isEmpty()&&!isBoiled()) {
            //bring the contents to boil
            boiled=true;
            System.out.println("BOILING THE CONTENTS OF MIXTURE");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}