package mypracticejava1;

public class Constructor1 {
    int a ;
    String name;
    public Constructor1(){


    }
    public Constructor1(int a,String name){
        this. a = a;
        this. name = name;
        System.out.println(a);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Constructor1 obj= new Constructor1();
        Constructor1 obj1=new Constructor1(10,"Setu");

    }
}

