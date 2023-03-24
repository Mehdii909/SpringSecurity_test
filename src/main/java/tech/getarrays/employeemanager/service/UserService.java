package tech.getarrays.employeemanager.service;

import tech.getarrays.employeemanager.model.Role;
import tech.getarrays.employeemanager.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User>getUsers();
}
