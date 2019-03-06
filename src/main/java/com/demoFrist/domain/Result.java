package com.demoFrist.domain;

/**
 * @ProjectName: SSMIntegration
 * @Package: com.demoFrist.domain
 * @ClassName: Result
 * @Author: Lenovo
 * @Description: ${description}
 * @Date: 2019/3/5 20:45
 * @Version: 1.0
 */
public class Result {

    public boolean success;
    public String msg;

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                '}';
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
