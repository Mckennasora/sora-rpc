package com.sora.example.consumer;

import com.sora.sorarpc.config.RpcConfig;
import com.sora.sorarpc.utils.ConfigUtils.ConfigUtils;

/**
 * 简易服务消费者示例
 *
 * @author sora
 */
public class ConsumerExample {

    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpc);
    }
}
