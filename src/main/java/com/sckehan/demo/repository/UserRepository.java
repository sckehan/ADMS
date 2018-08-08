package com.sckehan.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sckehan.demo.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("from User where id =:id ")
    public User getUser(@Param("id") Integer id);
}
