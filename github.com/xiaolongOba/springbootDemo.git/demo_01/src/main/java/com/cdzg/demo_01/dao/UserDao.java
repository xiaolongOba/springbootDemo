package com.cdzg.demo_01.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdzg.demo_01.domain.User;

public interface UserDao extends JpaRepository<User, Long> {
	User findByUserName(String username);
}
