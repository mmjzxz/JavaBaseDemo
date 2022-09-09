package org.zxz.proxy.JdkDynamicProxy;

/**
 * @author LEGION
 */
public class JdkDynamicProxy {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }
}
