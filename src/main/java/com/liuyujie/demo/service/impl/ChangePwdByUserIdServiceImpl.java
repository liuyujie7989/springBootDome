package com.liuyujie.demo.service.impl;

import com.liuyujie.demo.pojo.ChangePwdReqBO;
import com.liuyujie.demo.service.ChangePwdByUserIdService;
import com.liuyujie.demo.util.SaltUtils;
import com.ohaotian.plugin.base.exception.ZTBusinessException;
import com.ohaotian.plugin.common.util.DigestUtils;
import org.springframework.stereotype.Service;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-07-16 16:06
 **/
@Service
public class ChangePwdByUserIdServiceImpl implements ChangePwdByUserIdService {
    @Override
    public void changePasswordByUserId(ChangePwdReqBO changePwdReqBO) throws ZTBusinessException {
        String encrypt = DigestUtils.Encrypt(changePwdReqBO.getNewPassword(), "");
        String serialNo = SaltUtils.getSerialNo(8);
        String ggaPq7Tq = DigestUtils.Encrypt(changePwdReqBO.getNewPassword(), "");
        String password= DigestUtils.Encrypt(ggaPq7Tq + "ggaPq7Tq", "");

        System.out.println(password);
    }
}

