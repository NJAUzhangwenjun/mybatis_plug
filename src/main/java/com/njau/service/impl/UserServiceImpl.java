package com.njau.service.impl;

import com.njau.entity.User;
import com.njau.mapper.UserMapper;
import com.njau.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
