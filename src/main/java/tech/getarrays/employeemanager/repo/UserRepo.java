package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
