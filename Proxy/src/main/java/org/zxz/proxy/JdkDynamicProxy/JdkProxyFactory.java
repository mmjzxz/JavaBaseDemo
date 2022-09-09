package org.zxz.proxy.JdkDynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author LEGION
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target)
        );
    }
}
