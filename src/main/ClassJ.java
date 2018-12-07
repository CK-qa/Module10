package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ClassJ {

    public static void foo(String string1, int integer2) {
        MyString reverseStr = (str) -> {
            String result = "";

            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };
    }
    //test

    interface MyString {
        String reverseStr(String str);
    }

    void test(Consumer<String> foo) {

    }

    public void testHint() {
        test(test -> {
            System.out.println(test);
        });
    }
}