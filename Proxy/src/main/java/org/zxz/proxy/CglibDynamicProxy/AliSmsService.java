package org.zxz.proxy.CglibDynamicProxy;

/**
 * @author LEGION
 */
public class AliSmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
