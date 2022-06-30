package mypracticejava1;
// with return / with parameter
public class WithReWithPera {
    public int addition(int a, int b){
        int result = a+b;
        return result;
    }
    // with return / no parameter
    public static int division(){
        int b = 10;
        int c = 20;
       int result = b/c;
        return result ;

    }

    public static void main(String[] args) {
        WithReWithPera obj = new WithReWithPera();
        System.out.println(obj.addition(10,20));
        System.out.println(division());

    }

}
