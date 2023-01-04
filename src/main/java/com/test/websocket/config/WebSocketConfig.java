package com.test.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Author jin
 * @Date 2023/1/3 16:01
 * @Description TODO
 * https://blog.csdn.net/qq_48721706/article/details/124995148?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7ERate-1-124995148-blog-124454843.pc_relevant_3mothn_strategy_and_data_recovery&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7ERate-1-124995148-blog-124454843.pc_relevant_3mothn_strategy_and_data_recovery&utm_relevant_index=1
 * https://blog.csdn.net/huiyunfei/article/details/90719351?spm=1001.2101.3001.6650.1&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-90719351-blog-124995148.pc_relevant_multi_platform_whitelistv3&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-90719351-blog-124995148.pc_relevant_multi_platform_whitelistv3&utm_relevant_index=2
 */
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
