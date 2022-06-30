package mypracticejava1;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = "Setu";
        String s2 = "Patel";
        String s3 = "patel";
        String s4 ="";
        System.out.println(s1.concat("Patel"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.contains("S"));
        System.out.println(s2.length());
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s4.isEmpty());
        System.out.println(s3.getBytes());
        System.out.println(s3.replace("Setu","Prime"));



    }
}
