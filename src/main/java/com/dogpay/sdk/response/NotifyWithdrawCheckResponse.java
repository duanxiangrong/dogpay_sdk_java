package com.dogpay.sdk.response;

public class NotifyWithdrawCheckResponse {

    private Integer code; // 处理是否成功
    private String msg; // 处理后消息提示
    private String timestamp; // 返回数据timestamp
    private Object sign; // 返回数据sign

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Object getSign() {
        return sign;
    }

    public void setSign(Object sign) {
        this.sign = sign;
    }

    public NotifyWithdrawCheckResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public NotifyWithdrawCheckResponse(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.sign = data;
    }

    public static NotifyWithdrawCheckResponse ok(Object data) {
        return new NotifyWithdrawCheckResponse(0, "success", data);
    }

    public static NotifyWithdrawCheckResponse fail(String msg) {
        return new NotifyWithdrawCheckResponse(-1, msg);
    }
}
