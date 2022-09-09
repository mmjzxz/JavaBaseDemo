package org.zxz.generics;

/**
 * @author LEGION
 * 泛型接口
 */
public class GenericsDemo3 {
    public static void main(String[] args) {
        GenericsInfo3<String> genericsInfo = new GenericsInfo3Impl<>("mmjzxz");
        System.out.println(genericsInfo.getData());
    }
}

interface GenericsInfo3<T> {
    public T getData();
}

class GenericsInfo3Impl<T> implements GenericsInfo3<T> {
    private T data;

    public GenericsInfo3Impl() {
        super();
    }

    public GenericsInfo3Impl(T data) {
        this.setData(data);
    }

    @Override
    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}