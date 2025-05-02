package com.pjor.login_auth_jwt.repositories;


import com.pjor.login_auth_jwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);

}
