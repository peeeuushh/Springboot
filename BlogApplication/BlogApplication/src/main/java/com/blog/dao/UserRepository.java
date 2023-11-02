package com.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer>{

}
