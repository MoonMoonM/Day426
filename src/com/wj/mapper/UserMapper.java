package com.wj.mapper;

import com.wj.po.User;

public interface UserMapper {
    User findUserWithOrders(int id);
}
