package com.liuyujie.demo.service;

import com.liuyujie.demo.pojo.ChangePwdReqBO;
import com.ohaotian.plugin.base.exception.ZTBusinessException;

/**
 * 修改密码
 * Created By wuxin
 * Date: 2018/7/25 上午9:53
 */
public interface ChangePwdByUserIdService {

    void changePasswordByUserId(ChangePwdReqBO changePwdReqBO) throws ZTBusinessException;
}
