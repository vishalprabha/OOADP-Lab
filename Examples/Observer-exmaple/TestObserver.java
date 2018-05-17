import java.util.*;
class Faculty{
    ArrayList<Observer> students;
    String msg;
    public Faculty(){
        students=new ArrayList<Observer>();
    }

    void registerObserver(Observer o){
        students.add(o);
    }

    void removeObserver(Observer o){
        int i=students.indexOf(o);
        if(i>=0){
            students.remove(i);
        }
    }

    void notifyObservers(){
        for(int i=0;i<students.size();i++){
            Observer observer=(Observer)students.get(i);
            observer.update(msg);
        }
    }

    void setMsg(String msg){
        this.msg=msg;
    }
}

interface Observer{
    void update(String msg);
}

class Student implements Observer{
    Faculty faculty;
    String msg;

    public Student(Faculty faculty,String msg){
        this.faculty=faculty;
        System.out.println(msg);
        faculty.registerObserver(this);
    }

    public void update(String msg) {
        this.msg = msg;
    }

    void display(){
        System.out.println(msg);
    }
}

public class TestObserver{
    public static void main(String [] args){
        Faculty f1=new Faculty();
        Student s1=new Student(f1,"JUST SUBSCRIBED");
        f1.setMsg("FIRST LAB EXAM NEXT WEEK");
        f1.notifyObservers();
        s1.display();
        f1.setMsg("HAPPY VACATION");
        f1.notifyObservers();
        s1.display();
        Student s2=new Student(f1,"JUST SUBSCRIBED");
        s2.display();
        f1.setMsg("HELLO");
        f1.notifyObservers();
        s2.display();
        s1.display();
    }
}