package com.xtj.service.impl;

import com.xtj.dao.IUserDao;
import com.xtj.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("uService2")
public  class UserService2Impl implements  IUserService {
    @Resource
    private IUserDao iUserDao;

    public User selectUser(long userId) {
        return iUserDao.selectUser(userId);
    }

    public List<User> findUser() {
        return iUserDao.findUser();
    }


    public boolean Adduser(User u) {
        return iUserDao.Adduser(u);
    }


    public boolean Upuser(User u) {
        return iUserDao.Upuser(u);
    }


    public boolean Deluser(Integer id) {
        return iUserDao.Deluser(id);
    }


    public User FindOneUser(int id) {
        return iUserDao.FindOneUser(id);
    }


    public List<User> FindByName(String Name) {
        return iUserDao.FindByName(Name);
    }
}
