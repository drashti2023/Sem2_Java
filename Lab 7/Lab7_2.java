interface A{
    int a = 23;
    void methodA();

}
interface A1 extends A{
    int a1= 23;
    void methodA1();

}
interface A2 extends A{
    int a2 = 23;
    void methodA2();

}
interface A12 extends A1,A2{
    int a12 = 24;
    void methodA12();
}
class B implements A12{
    public void methodA(){
        System.out.println(a);

    }
    public void methodA1(){
        System.out.println(a1);
    }
    public void methodA2(){
        System.out.println(a2);
    }
    public void methodA12(){
        System.out.println(a12);
    }
}

public class Lab7_2 {
    public static void main(String[] args){
        B b = new B();
        b.methodA();
        b.methodA1();
        b.methodA2();
        b.methodA12();

    }
    
}
