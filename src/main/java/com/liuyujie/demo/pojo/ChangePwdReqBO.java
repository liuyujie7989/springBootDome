package com.liuyujie.demo.pojo;

import com.ohaotian.plugin.base.bo.ReqInfo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ChangePwdReqBO extends ReqInfo {

    private static final long serialVersionUID = 1007643583912305540L;

    @NotNull(message = "原密码不能为空")
    private String oldPassword;

    @Pattern(regexp = "^(?![\\d]+$)(?![a-zA-Z]+$)(?![^\\da-zA-Z]+$).{6,20}$", message = "密码格式错误，密码为6-20个字符，应包含字母、数字以及标点符号（除空格）至少两种！")
    @NotNull(message = "新密码不能为空")
    private String newPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    @Override
    public String toString() {
        return "ChangePwdReqBO{" +
                "oldPassword='" + oldPassword + '\'' +
                ", newPassword='" + newPassword + '\'' +
                '}';
    }
}
