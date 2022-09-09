package org.zxz.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author LEGION
 * 泛型上下限
 */
public class GenericsDemo6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(23);
        list.add(13);
        list.add(54);
        list.add(35);
        System.out.println(max(list));
    }

    public static <E extends Comparable<? super E>> E max(List<? extends E> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        Iterator<? extends E> iterator = list.iterator();
        E result = iterator.next();
        while (iterator.hasNext()){
            E next = iterator.next();
            if (next.compareTo(result) > 0) {
                result = next;
            }
        }
        return result;
    }
}
