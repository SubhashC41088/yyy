package com.Zibra.Zibra.Service;

import java.util.List;

import com.Zibra.Zibra.Entity.User;

public interface UserService  {
	


    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);

}
