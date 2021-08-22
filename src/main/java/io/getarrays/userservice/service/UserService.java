package io.getarrays.userservice.service;

import java.util.List;

import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;

public interface UserService {
	User saveUser(User user);

	Role saveRole(Role role);

	void addRoleToUser(String username, String roleName); // Assuming every username is unique

	User getUser(String username);

	List<User> getUsers(); //In real world app, we would use pagination concept to load usernames and not load all the users from db (as that is a very poor code and affect backend performance)
}
