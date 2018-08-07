package com.github.saber.user.service.impl;

import com.github.saber.user.entity.User;
import com.github.saber.user.mapper.UserMapper;
import com.github.saber.user.service.UserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 用户信息表，保存用户信息。 服务实现类
 * </p>
 *
 * @author jianb.jiang
 * @since 2018-08-07
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAll() {
        return userMapper.selectList(new EntityWrapper<User>());
    }
}
