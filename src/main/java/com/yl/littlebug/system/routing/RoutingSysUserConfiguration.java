package com.yl.littlebug.system.routing;

import com.yl.littlebug.system.handler.SysUserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * @author by wzc
 * @Description 请求分发
 * @Date 2021/12/1 10:25
 */
//@Configuration
public class RoutingSysUserConfiguration {


    /**
     * 尝试性做法
     * @param sysUserHandler
     * @return
     */
    @Bean
    public RouterFunction<ServerResponse> monoSysUserRouterFunction (SysUserHandler sysUserHandler) {
        return route(GET("/demo/system/user/findAll").and(accept(MediaType.APPLICATION_JSON)), sysUserHandler::findAll)
                .andRoute(GET("/demo/system/user/findById/{id}").and(accept(MediaType.APPLICATION_JSON)), sysUserHandler::findById)
                .andRoute(POST("/demo/system/user/save").and(accept(MediaType.APPLICATION_JSON)),sysUserHandler::save);

    }


}
