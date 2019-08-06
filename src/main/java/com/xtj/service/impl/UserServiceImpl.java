package com.xtj.service.impl;

import com.xtj.dao.IUserDao;
import com.xtj.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("uService")
public  class UserServiceImpl implements  IUserService {
    @Resource
    private IUserDao iUserDao;

    @Override
    public List<User> findUser() {
        return null;
    }

    @Override
    public boolean Adduser(User u) {
        return false;
    }

    @Override
    public boolean Upuser(User u) {
        return false;
    }

    @Override
    public boolean Deluser(Integer id) {
        return false;
    }

    @Override
    public User FindOneUser(int id) {
        return null;
    }

    public User selectUser(long userId) {
        return iUserDao.selectUser(userId);
    }

    @Override
    public List<User> FindByName(String Name) {
        return null;
    }
}
