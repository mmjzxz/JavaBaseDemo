package org.zxz.generics;

/**
 * @author LEGION
 * 泛型类
 */
public class GenericsDemo1 {
    public static void main(String[] args) {
        GenericsInfo1<String> genericsInfo = new GenericsInfo1<>();
        genericsInfo.setData("mmjzxz");
        System.out.println(genericsInfo.getData());
    }
}

class GenericsInfo1<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
