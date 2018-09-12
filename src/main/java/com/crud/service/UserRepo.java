package com.crud.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.Model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
