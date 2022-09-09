package org.zxz.classLoader;

/**
 * @author LEGION
 */
public class ClassLoaderDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        new Test();
        ClassLoader loader = ClassLoaderDemo1.class.getClassLoader();
        System.out.println(loader);
        //使用ClassLoader.loadClass()来加载类，不会执行初始化块
        loader.loadClass("org.zxz.classLoader.Test");
        //使用Class.forName()来加载类，会执行初始化块
        Class.forName("org.zxz.classLoader.Test");
        //使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块
        Class.forName("org.zxz.classLoader.Test", false, loader);
    }
}

class Test{
    static {
        System.out.println("Test静态代码块");
    }
}