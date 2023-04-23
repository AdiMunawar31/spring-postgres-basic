package com.d2y.SpringPostgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d2y.SpringPostgres.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
