package com.wit.xzy.api;

/**
 * @Author ZongYou
 **/
public interface HelloService {
    /**
     * 定义一个公共接口HelloService，Client与Server都可访问到
     * @param object
     * @return
     */
    String hello(HelloObject object);
}
