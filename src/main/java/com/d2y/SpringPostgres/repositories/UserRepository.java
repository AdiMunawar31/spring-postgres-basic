package com.d2y.SpringPostgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.d2y.SpringPostgres.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
