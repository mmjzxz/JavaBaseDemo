package org.zxz.generics;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * @author LEGION
 */
public class GenericsDemo8<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        GenericsDemo8<String> genericType = new GenericsDemo8<String>(){};
        Type superclass = genericType.getClass().getGenericSuperclass();
        //getActualTypeArguments 返回确切的泛型参数, 如Map<String, Integer>返回[String, Integer]
        Type type = ((ParameterizedType) superclass).getActualTypeArguments()[0];
        //class java.lang.String
        System.out.println(type);

        GenericsDemo8<Map<String,Integer>> genericTypeMap = new GenericsDemo8<Map<String,Integer>>(){};
        Type superclassMap = genericTypeMap.getClass().getGenericSuperclass();
        Type typeMap = ((ParameterizedType) superclassMap).getActualTypeArguments()[0];
        System.out.println(typeMap);
    }
}

