package org.zxz.generics;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LEGION
 * 泛型擦除
 */
public class GenericsDemo7 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        test1();
        test2();
    }

    private static void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.getClass().getMethod("add", Object.class).invoke(list, "mmjzxz");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        list.forEach(System.out::println); //java.lang.String cannot be cast to java.lang.Integer
    }

    private static void test1() {
        List<String> list1 = new ArrayList<>();
        list1.add("mmjzxz");
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        System.out.println(list1.getClass());
        System.out.println(list1.getClass() == list2.getClass());
    }
}
