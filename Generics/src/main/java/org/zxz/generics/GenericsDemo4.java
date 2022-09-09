package org.zxz.generics;

/**
 * @author LEGION
 * 泛型方法
 */
public class GenericsDemo4 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println(add(1, 2));
        System.out.println(add(1.4f, 2.0f));
        System.out.println(add(0.1d, 0.1d));
    }

    public static <T extends Number> T add(T t1, T t2) throws InstantiationException, IllegalAccessException {
        boolean instance = t1.getClass().isInstance(t2);
        if (instance) {
//            T result = (T) t1.getClass().newInstance();
            return (T) new Double(t1.doubleValue() + t2.doubleValue());
        } else {
            throw new IllegalAccessException("类型不匹配");
        }
    }
}
