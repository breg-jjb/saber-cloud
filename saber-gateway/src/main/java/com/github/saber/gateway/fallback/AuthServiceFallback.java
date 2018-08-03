package com.github.saber.gateway.fallback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.github.saber.gateway.feign.IAuthService;

/**
 * <b>Description:</b>
 * <br><b>ClassName:</b> AuthServiceFallback
 * <br><b>Date:</b> 2018年7月12日 下午6:26:11
 * <br>@author <b>jianb.jiang</b>
 */
@Service
@Slf4j
public class AuthServiceFallback implements IAuthService {
    @Override
    public String getPermissionByUsername(@PathVariable("username") String username) {
        log.error("调用{}异常{}","getPermissionByUsername",username);
        return null;
    }

}
