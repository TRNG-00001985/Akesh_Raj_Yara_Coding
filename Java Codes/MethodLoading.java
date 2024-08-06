class A{

public void method1() {

System.out.println("HI");

}

public void method1(int a) {

System.out.println("Number is "+a);

}

}

public class MethodLoading {

public static void main(String[] args) {

A o= new A();

o.method1();

o.method1(5);

}

}