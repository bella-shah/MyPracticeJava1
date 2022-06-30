package mypracticejava1;

public class variable1 {
    int a = 100;
    String b = "Class";
    Character c = 'S';
    static int f = 1000;
  //String s = "0453892576543213";

    public void Test(){
        int a1 = 50;
        System.out.println(a1);
    }
    public static void Test1(int d, int e){
        System.out.println(d+e);
    }
    public static boolean Test2() {
        boolean b = true;
        return true;
    }

    public static void main(String[] args) {
        variable1 obj = new variable1();
        obj.Test();
        Test1(30,40);
        System.out.println(Test2());
        System.out.println(obj.b);
        System.out.println(f);

    }


    }

