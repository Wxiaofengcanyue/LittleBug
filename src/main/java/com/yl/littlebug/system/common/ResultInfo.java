package com.yl.littlebug.system.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @author by wzc
 * @Description 消息返回体
 * @Date 2021/11/30 17:29
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultInfo {


    /**
     * 返回状态码
     */
    private int code;

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 返回数据
     */
    private Object data;

    public static ResultInfo ok (Object data) {
        return new ResultInfo(HttpStatus.OK.value(), "成功",data);
    }

    public static ResultInfo ok (String message, Object data) {
        return new ResultInfo(HttpStatus.OK.value(), message, data);
    }

    public static ResultInfo error (String message, Object data) {
        return new ResultInfo(HttpStatus.INTERNAL_SERVER_ERROR.value(), message, data);
    }
}
