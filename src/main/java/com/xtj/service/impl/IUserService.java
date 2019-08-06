package com.xtj.service.impl;
import com.xtj.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserService {

    List<User> findUser ();

    boolean Adduser(User u);

    boolean Upuser(User u);

    boolean Deluser(Integer id);

    User FindOneUser(int id);

    User selectUser(long userId);

    List<User> FindByName (String Name);

}
