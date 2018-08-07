package com.github.saber.user.service;

import com.github.saber.user.entity.User;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户信息表，保存用户信息。 服务类
 * </p>
 *
 * @author jianb.jiang
 * @since 2018-08-07
 */
public interface UserService extends IService<User> {

    public List<User> listAll();
}
