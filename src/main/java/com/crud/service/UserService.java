package com.crud.service;

import org.springframework.stereotype.Repository;

import com.crud.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface UserService extends JpaRepository<User, Long> {

}
