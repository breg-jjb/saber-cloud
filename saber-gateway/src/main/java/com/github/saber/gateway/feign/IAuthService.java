package com.github.saber.gateway.feign;

import com.github.saber.gateway.fallback.AuthServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <b>Description:</b>
 * <br><b>ClassName:</b> IAuthService
 * <br><b>Date:</b> 2018年7月12日 下午6:25:32
 * <br>@author <b>jianb.jiang</b>
 */
@FeignClient(value = "saber-auth",fallback = AuthServiceFallback.class)
public interface IAuthService {
  @RequestMapping(value="/api/user/un/{username}/permissions",method = RequestMethod.GET)
  public String getPermissionByUsername(@PathVariable("username") String username);
}
