package com.xtj.dao;
import  com.xtj.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {

    List<User> findUser ();

    boolean Adduser(User u);

    boolean Upuser(User u);

    boolean Deluser(Integer id);

    User FindOneUser(int id);

    User selectUser(long userId);

    List<User> FindByName (@Param("Name") String Name);
}
