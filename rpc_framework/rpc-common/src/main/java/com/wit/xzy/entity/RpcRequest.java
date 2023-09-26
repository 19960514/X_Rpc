package com.wit.xzy.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author ZongYou
 **/
@Data
//使用创建者模式，一次性给所有变量初始赋值
@Builder
public class RpcRequest implements Serializable {
/**
 * 为什么要定义一个传输协议
 * 客户端向服务端传递对象时，服务端段的公共接口实现类中可能存在多个同名方法，
 * 即存在方法重载，因此，仅靠方法名无法唯一确定某个具体的方法，因此必须将方法的参数和参数类型同时发送过去
 */


    /**
     * 待调用接口名称
     */
    private String interfaceName;
    /**
     * 待调用方法名称
     */
    private String methodName;
    /**
     * 待调用方法的参数
     */
    private Object[] parameters;
    /**
     * 待调用方法的参数类型
     */
    private Class<?>[] paramTypes;
}
