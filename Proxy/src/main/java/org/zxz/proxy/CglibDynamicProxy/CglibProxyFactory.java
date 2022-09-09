package org.zxz.proxy.CglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author LEGION
 */
public class CglibProxyFactory {
    public static Object getProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new DebugMethodInterceptor());
        return enhancer.create();
    }
}
