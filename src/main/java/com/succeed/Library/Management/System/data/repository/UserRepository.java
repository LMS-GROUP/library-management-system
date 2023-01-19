package com.succeed.Library.Management.System.data.repository;

import com.succeed.Library.Management.System.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
