package mypracticejava1;

public class ConditionalStatement {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 50;
        if (a > b) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }

        if (c == 50) {
            System.out.println(c);

        } else if (c == 60) {
            System.out.println(c + "is < 30");

        } else if (c < 50) {
            System.out.println(c + "is <50");

        } else {
            System.out.println("Error");
        }
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");

        }

    }

}
