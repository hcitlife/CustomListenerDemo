package com.hc;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request监听器，销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request监听器，初始化");
    }
}
