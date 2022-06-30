package mypracticejava1;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> browser = new ArrayList();
        browser.add("Firefox");
        browser.add("Chrome");
        browser.add("Safari");
        browser.add("Opera");
        for(String list  : browser){
            System.out.println(list);

    }
}
}
