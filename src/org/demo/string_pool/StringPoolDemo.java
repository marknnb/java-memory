package org.demo.string_pool;

import java.util.ArrayList;

public class StringPoolDemo {
    public static void main(String[] args) {
        String one = "hello";
        String two = "hello";


        System.out.println(one == two);
        System.out.println(one.equals(two));

        Integer i = 10;
        String three = i.toString().intern();
        String four = "10";

        System.out.println(three.equals(four));
        System.out.println(three == four);
        System.out.println("==========================");


        ArrayList<String> strings = new ArrayList<>();
        for (int j = 0; j < 10000000; j++) {
            String item = i.toString().intern();
            strings.add(item);
        }

    }
}
