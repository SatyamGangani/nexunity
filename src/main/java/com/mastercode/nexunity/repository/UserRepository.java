package com.mastercode.nexunity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastercode.nexunity.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {

}