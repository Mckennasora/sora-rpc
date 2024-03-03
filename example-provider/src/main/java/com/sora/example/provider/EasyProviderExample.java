package com.sora.example.provider;

import com.sora.sorarpc.server.HttpServer;
import com.sora.sorarpc.server.VertxHttpServer;

/**
 * 简易服务提供者示例
 * @author sora
 */
public class EasyProviderExample {

    public static void main(String[] args) {
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}