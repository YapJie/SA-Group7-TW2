package com.example.sa_g7_tw2_spring.Domain;

import com.example.sa_g7_tw2_spring.ValueObject.AccountVO;
import com.example.sa_g7_tw2_spring.ValueObject.LoginDataVO;
import com.example.sa_g7_tw2_spring.ValueObject.UserVO;
import org.springframework.util.ObjectUtils;

public class InputLegalMiddleware extends MiddlewareAuth {


    @Override
    public boolean auth(LoginDataVO vo, AccountVO accountVO) {
        // 模擬驗證輸入不合法
        if (ObjectUtils.isEmpty(vo.getAccount()) || ObjectUtils.isEmpty(vo.getPassword())) {
            return false;
        }

        return super.auth(vo,accountVO);
    }
}
