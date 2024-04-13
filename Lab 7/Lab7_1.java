abstract class Vegetable{
    String name;
    String color;
    
    Vegetable(String name, String color){
        this.name = name;
        this.color = color;
    }

    abstract public String toString();
}
class Potato extends Vegetable{
    Potato(){
        super("Potato","Brown");
    }
    public String toString(){
        return("Name:"+name+" "+"Color:"+color);
    }
 }

class Brinjal extends Vegetable{
    Brinjal(){
        super("Brinjal","Purple");
    }
    public String toString(){
        return("Name:"+name+" "+"Color:"+color);
    }
}
class Tomato extends Vegetable{
    Tomato(){
        super("Tomato","Red");
    }
    public String toString(){
        return("Name:"+name+" "+"Color:"+color);
    }
}


public class Lab7_1 {
    public static void main(String[] args){
       Potato a = new Potato();
       Brinjal b = new Brinjal();
       Tomato c= new Tomato();
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
    }

    
}
