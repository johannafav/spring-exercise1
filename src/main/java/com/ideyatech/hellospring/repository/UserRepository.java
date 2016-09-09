package com.ideyatech.hellospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ideyatech.hellospring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
