package org.alone.springsecurity.Repository;

import org.alone.springsecurity.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer > {

    User findByUserName(String userName);
}
