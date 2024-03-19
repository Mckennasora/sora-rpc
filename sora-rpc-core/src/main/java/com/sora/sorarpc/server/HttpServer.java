package com.sora.sorarpc.server;

/**
 * HTTP 服务器接口
 * @author sora
 */
public interface HttpServer {

    /**
     * 启动服务器
     *
     * @param port
     */
    void doStart(int port);
}
