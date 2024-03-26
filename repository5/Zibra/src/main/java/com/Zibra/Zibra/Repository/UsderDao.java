package com.Zibra.Zibra.Repository;

import java.util.List;

import com.Zibra.Zibra.Entity.User;

public interface UsderDao {
	

    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);

}
