package com.wit.xzy.testserver;

import com.wit.xzy.api.HelloService;
import com.wit.xzy.server.RpcServer;

/**
 * @Author ZongYou
 **/
public class testServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        //注册HelloServiceImpl服务
        rpcServer.register(helloService, 9000);
    }
}
