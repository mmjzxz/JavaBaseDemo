package org.zxz.proxy.CglibDynamicProxy;

/**
 * @author LEGION
 */
public class CglibDynamicProxy {
    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java");
    }
}
