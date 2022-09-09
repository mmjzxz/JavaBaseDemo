package org.zxz.generics;

/**
 * @author LEGION
 * 多元泛型
 */
public class GenericsDemo2 {
    public static void main(String[] args) {
        GenericsInfo2<String, Integer> genericsInfo = new GenericsInfo2<>();
        genericsInfo.setKey("mmjzxz");
        genericsInfo.setValue(1);
        System.out.println(genericsInfo.getKey() + " " + genericsInfo.getValue());
    }
}

class GenericsInfo2<K, V> {
    private K key;
    private V value;
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
