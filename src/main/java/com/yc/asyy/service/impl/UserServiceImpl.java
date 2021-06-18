package com.yc.asyy.service.impl;

import com.yc.asyy.entity.User;
import com.yc.asyy.mapper.UserMapper;
import com.yc.asyy.service.UserService;
import com.yc.asyy.base.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-06-17
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

}
