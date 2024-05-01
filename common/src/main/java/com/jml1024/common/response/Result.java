package com.jml1024.common.response;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(title = "请求结果", description = "请求结果详细信息")
public class Result<T> {
    @Schema(title = "请求结果代码", description = "请求结果状态")
    private Integer code;

    @Schema(title = "错误信息", description = "错误详细信息")
    private String message;

    @Schema(title = "请求响应信息")
    private T data;

    @Schema(title = "请求时间戳")
    private Long timestamp;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
