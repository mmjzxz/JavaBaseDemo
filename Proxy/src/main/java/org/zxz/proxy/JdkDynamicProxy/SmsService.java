package org.zxz.proxy.JdkDynamicProxy;

/**
 * @author LEGION
 */
public interface SmsService {

    /**
     * 发送短信
     *
     * @param message
     * @return
     */
    String send(String message);
}
