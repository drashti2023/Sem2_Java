//Super Keyword using Method and variable
class A {
    int i = 10;

    void display() {
        System.out.println("Inside A:i=" + i);
    }
}

class B extends A {
    int i = 20;
    int k = 10;

    B(int a, int b) {
        super.i = a;
        super.display();
        this.i = b;
    }

    void display() {
        System.out.println("Super.i=" + super.i);
        System.out.println("this.i=" + this.i);
    }
}

class Lab6_6 {
    public static void main(String[] args) {
        B b = new B(20, 30);
        b.display();
    }
}
